(ns fulcrologic.semantic-ui.workspaces.icon
  (:require [com.fulcrologic.fulcro.components :as fp]
            [com.fulcrologic.fulcro.dom :as dom]
            [com.fulcrologic.fulcro.mutations :as fm]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.lib.fulcro-portal :as f.portal]
            [com.fulcrologic.semantic-ui.elements.icon.ui-icon :refer [ui-icon]]
            [com.fulcrologic.semantic-ui.icons :as i]
            [clojure.string :as string]
            [cljs.tools.reader :refer [read-string]]
            [cljs.js :refer [empty-state eval js-eval]]))

(defn eval-str [s]
  (eval (empty-state)
    (read-string s)
    {:eval          js-eval
     :source-map    true
     :def-emits-var true
     :context       :expr}
    (fn [result] result)))

(fp/defsc Icons
  [this {:keys [x]}]
  {:initial-state (fn [_] {:x "x"})
   :ident         (fn [] [::id "singleton"])
   :query         [:x]}
  (let [icons (ns-publics 'com.fulcrologic.semantic-ui.icons)]
    (dom/div
      {}
      ; not sure how to eval the icon defs so for now derived by string munging
      ; for future reference: this works but with warnings;
      ; (println (eval-str (str (:ns (meta func)) "/" (:name (meta func)))))
      (mapv #(ui-icon {:name (-> % last meta :name name
                               (string/replace #"-icon" "")
                               (string/replace #"-" " ")
                               (string/replace #"_" "")
                               (string/replace #"wi fi" "wi-fi"))
                       :key  (-> % last meta :name)})
        (sort-by #(-> % first) icons)))))

(ws/defcard icons
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? false
     ::ct.fulcro/root       Icons}))

