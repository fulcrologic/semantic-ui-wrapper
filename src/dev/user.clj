(ns user
  (:require
    [clojure.data.json :as json]
    [clojure.java.io :refer [as-file file make-parents reader]]
    [clojure.string :as str]))

(def factories-preamble
  "(ns com.fulcrologic.semantic-ui.factories
   (:require
     #?(:cljs [semantic-ui-react :as suir])
     [com.fulcrologic.semantic-ui.factory-helpers :as h]))

 ")

;; =============================================================================
;; CLJ Stub Configuration
;; =============================================================================
;; Maps component types to their CLJ stub factory function and arguments.
;; Components not listed here use the generic make-stub-factory.

(def form-input-components
  "Components that render as HTML form inputs"
  #{"Input" "FormInput" "Search" "DropdownSearchInput"})

(def select-components
  "Components that render as HTML selects.
   Note: Dropdown/FormDropdown are NOT included because they're often used
   as menu containers with nested DropdownMenu/DropdownItem children."
  #{"Select" "FormSelect"})

(def textarea-components
  "Components that render as HTML textareas"
  #{"TextArea" "FormTextArea"})

(def checkbox-components
  "Components that render as HTML checkboxes"
  #{"Checkbox" "FormCheckbox" "Radio" "FormRadio"})

(def modal-components
  "Components that only render when open"
  #{"Modal" "Popup" "Portal" "TransitionablePortal" "Confirm" "Dimmer"})

(defn clj-stub-for-component
  "Returns the CLJ stub factory call for a component.
   Returns a string like `(h/make-stub-factory \"Button\")` or
   `(h/make-form-stub-factory \"Input\" :input)`"
  [class]
  (cond
    (contains? form-input-components class)
    (str "(h/make-form-stub-factory \"" class "\" :input)")

    (contains? select-components class)
    (str "(h/make-form-stub-factory \"" class "\" :select)")

    (contains? textarea-components class)
    (str "(h/make-form-stub-factory \"" class "\" :textarea)")

    (contains? checkbox-components class)
    (str "(h/make-form-stub-factory \"" class "\" :checkbox)")

    (contains? modal-components class)
    (str "(h/make-modal-stub-factory \"" class "\")")

    :else
    (str "(h/make-stub-factory \"" class "\")")))

(defn hyphenated [camelCase]
  (-> camelCase
    (str/replace #"([A-Z])" "-$1")
    (str/lower-case)
    (str/replace #"^-" "")))

(defn gen-docstring [doc-data]
  (let [description  (get-in doc-data [:docblock :description])
        description  (if (seq description) (str/join "\n  " description))
        props        (sort-by :name (get doc-data :props))
        docs-by-name (map (fn [{:keys [type description name value]}]
                            (let [n (count value)]
                              (cond-> (str name " (" type "): " (first description))
                                value (str " (" (str/join ", " (take 100 value)) (when (> n 100) " ...") ")")))) props)]
    (str description "\n\n  Props:\n    - " (str/join "\n    - " docs-by-name))))

(defn quoted [s] (str "\"" s "\""))
(defn escaped [s] (str/replace s "\"" "\\\""))

(def input-factory-classes
  #{"Input"
    "Checkbox"
    "FormInput"
    "DropdownSearchInput"
    "Search"
    "TextArea"})

(defn factory-helper [class]
  (if (contains? input-factory-classes class)
    "wrapped-factory-apply"
    "factory-apply"))

(defn factory-helper-function
  ([{:keys [class factory-name docstring]}]
   (factory-helper-function class factory-name docstring true))
  ([class factory-name docstring]
   (factory-helper-function class factory-name docstring false))
  ([class factory-name docstring get-as-string]
   (let [class-ref (if get-as-string
                     (str "suir/" class)
                     class)
         clj-stub  (clj-stub-for-component class)]
     (str "(def " factory-name "\n"
       "  \""
       (escaped docstring)
       "\""
       "\n  "
       " #?(:clj  " clj-stub "\n"
       "     :cljs (h/" (factory-helper class) " " class-ref ")))\n"))))

; shadow-cljs v2.18.0 fails to build with this form of require:
;; [semantic-ui-react$Confirm :as Confirm]
;; "Multiple files failed to compile.  aborted par-compile"
;; It passes with:
;; ["semantic-ui-react$Confirm" :as Confirm]
;;
;; For CLJ compatibility, we wrap the JS require in a reader conditional.
(defn factory-ns-cljs [ns class factory-name docstring]
  (str "(ns " ns "\n"
    "  (:require\n"
    "    [com.fulcrologic.semantic-ui.factory-helpers :as h]\n"
    "    #?(:cljs [\"semantic-ui-react$" class "\" :as " class "])))\n\n"
    "  " (factory-helper-function class factory-name docstring)))

(defn gen-factory-map [out-path]
  (fn [doc-data]
    (let [{:keys [displayName props type repoPath]} doc-data
          class        displayName
          factory-name (str "ui-" (hyphenated class))
          tree         (-> repoPath str/lower-case (str/split #"/"))
          treeparts    (subvec tree 1 (- (count tree) 1))
          filename     (str out-path "/" (str/join "/" treeparts) "/" (str/replace factory-name #"-" "_") ".cljc")
          nns          (str "com.fulcrologic.semantic-ui" "." (str/join "." treeparts) "." factory-name)
          docstring    (gen-docstring doc-data)]
      {:class        class
       :factory-name factory-name
       :include-file (-> repoPath (str/replace #"src" "semantic-ui-react/dist/commonjs")
                       (str/replace #"\.js" ""))
       :filename     filename
       :ns           nns
       :docstring    docstring
       :props        props})))

(defn read-info [dir filename]
  (with-open [r (reader (as-file (str dir "/" filename)))]
    (json/read r :key-fn keyword)))

(defn icons-ns [icon-names]
  (let [icons (str/join "\n"
                (mapv (fn [[symbol css-class]]
                        (str "(def " symbol " \"" css-class "\")"))
                  (->> icon-names
                    (map #(let [symbol    (-> %
                                            (str/replace #" " "-")
                                            (str/replace #"^(\d+.*)" "_$1")
                                            (str "-icon"))
                                css-class (-> %
                                            (str/replace #"-" " "))]
                            [symbol css-class]))
                    sort
                    distinct)))]
    (str "(ns com.fulcrologic.semantic-ui.icons)\n\n" icons)))

(defn gen-cljs-factories [modules]
  (str factories-preamble (str/join "\n" (map factory-helper-function modules))))

(defn gen-factories [component-dir]
  (let [modules (->> (seq (.list (file component-dir)))
                  (map #(read-info component-dir %))
                  (map (gen-factory-map "src/main/com/fulcrologic/semantic_ui/"))
                  (sort-by :factory-name))]
    (spit (as-file "src/main/com/fulcrologic/semantic_ui/factories.cljc") (gen-cljs-factories modules))
    (doseq [{:keys [ns class factory-name filename docstring props]} modules]
      (make-parents filename)
      (spit (as-file filename) (factory-ns-cljs ns class factory-name docstring))
      (if (= class "Icon")
        (spit (as-file "src/main/com/fulcrologic/semantic_ui/icons.cljc") (icons-ns (->> props (filter #(= (:name %) "name")) first :value)))))))

;; =============================================================================
;; Migration: Add CLJ stubs to existing component files
;; =============================================================================

(defn extract-class-from-file
  "Extract the component class name from a component file's require form.
   Looks for patterns like: [\"semantic-ui-react$Button\" :as Button]"
  [content]
  (when-let [match (re-find #"\[\"semantic-ui-react\$(\w+)\"" content)]
    (second match)))

(defn update-component-file
  "Update a component file to add CLJ stub alongside CLJS factory.
   Returns the updated content string."
  [content]
  (if-let [class (extract-class-from-file content)]
    (let [clj-stub (clj-stub-for-component class)]
      ;; Replace #?(:cljs (h/...) with #?(:clj ... :cljs (h/...)
      (-> content
        (str/replace #"#\?\(:cljs \(h/(factory-apply|wrapped-factory-apply) (\w+)\)\)"
          (str "#?(:clj  " clj-stub "\n     :cljs (h/$1 $2))"))))
    content))

(defn wrap-js-require-in-reader-conditional
  "Wrap JS requires in #?(:cljs ...) for CLJ compatibility.
   Returns the updated content string."
  [content]
  ;; Match: [\"semantic-ui-react$Foo\" :as Foo] that is NOT already wrapped
  ;; Replace with: #?(:cljs [\"semantic-ui-react$Foo\" :as Foo])
  (-> content
    ;; Only wrap if not already wrapped in reader conditional
    (str/replace #"(\n\s+)\[\"(semantic-ui-react\$\w+)\" :as (\w+)\]\)"
      "$1#?(:cljs [\"$2\" :as $3]))")))

(defn migrate-component-files!
  "Update all component files in the given directory to add CLJ stubs.
   This is a one-time migration for existing files."
  [src-dir]
  (let [component-files (->> (file-seq (file src-dir))
                          (filter #(.isFile %))
                          (filter #(str/ends-with? (.getName %) ".cljc"))
                          (filter #(not (str/includes? (.getPath %) "factory_helpers")))
                          (filter #(not (str/includes? (.getPath %) "factories.cljc")))
                          (filter #(not (str/includes? (.getPath %) "icons.cljc"))))]
    (doseq [f component-files]
      (let [path    (.getPath f)
            content (slurp f)
            updated (update-component-file content)]
        (when (not= content updated)
          (println "Updating:" path)
          (spit f updated))))
    (println "Migration complete!")))

(defn fix-js-requires!
  "Wrap JS requires in #?(:cljs ...) for all component files.
   This allows the files to be loaded in CLJ without errors."
  [src-dir]
  (let [component-files (->> (file-seq (file src-dir))
                          (filter #(.isFile %))
                          (filter #(str/ends-with? (.getName %) ".cljc"))
                          (filter #(not (str/includes? (.getPath %) "factory_helpers")))
                          (filter #(not (str/includes? (.getPath %) "factories.cljc")))
                          (filter #(not (str/includes? (.getPath %) "icons.cljc"))))]
    (doseq [f component-files]
      (let [path    (.getPath f)
            content (slurp f)
            updated (wrap-js-require-in-reader-conditional content)]
        (when (not= content updated)
          (println "Fixing JS require:" path)
          (spit f updated))))
    (println "JS require fix complete!")))

(comment
  ;; to generate the factories files
  ;; clone semantic-ui-react:
  ;; git clone https://github.com/Semantic-Org/Semantic-UI-React
  ;; in the cloned repo:
  ;; yarn install
  ;; yarn build:docs
  ;; then using the path to the docs/src/componentInfo folder, start a repl and run
  ;;
  (gen-factories "/Users/tonykay/oss/Semantic-UI-React/docs/src/componentInfo")

  (gen-factories "/Users/danie/matter/source/Semantic-UI-React/docs/src/componentInfo")

  ;; To add CLJ stubs to existing component files:
  (migrate-component-files! "src/main/com/fulcrologic/semantic_ui"))


