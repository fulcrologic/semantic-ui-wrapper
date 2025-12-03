(ns com.fulcrologic.semantic-ui.factory-helpers
  (:require
    #?(:cljs react)
    #?(:cljs [com.fulcrologic.fulcro.dom :as dom]
       :clj  [com.fulcrologic.fulcro.dom-server :as dom])))

(defn factory-apply
  "Creates a function that can make elements of the given class."
  [class]
  (fn [props & children]
    #?(:clj  (apply dom/create-element class props children)
       ;; bug in Fulcro 3.4.4 and below makes above not work in cljs, though it should
       :cljs (apply react/createElement class (clj->js props) children))))

(defn wrapped-factory-apply
  "Returns a factory that wraps the given class as an input. Requires that the target item support `:value` as a prop."
  [class]
  #?(:clj  (factory-apply class)
     :cljs (let [factory (dom/wrap-form-element class)]
             (fn [props & children]
               (apply factory (clj->js props) children)))))

;; =============================================================================
;; CLJ Stub Support for Headless/SSR
;; =============================================================================
;; These functions create server-side stubs that render as dom-server Elements
;; using the component name as the tag. Props are left unmolested for testing.

#?(:clj
   (defn make-stub-factory
     "Creates a CLJ stub factory for a Semantic UI component.
      Returns dom-server Elements with component name as tag and props unchanged.

      Args:
        component-type - String name of the component (e.g. \"Button\", \"Dropdown\")

      Returns:
        A function that takes props and children, returning a dom-server Element."
     [component-type]
     (fn [props & children]
       (apply dom/create-element component-type props children))))

#?(:clj
   (defn make-form-stub-factory
     "Creates a CLJ stub factory for Semantic UI form elements.
      Returns dom-server Elements with component name as tag and props unchanged.

      Args:
        component-type - String name of the component (e.g. \"Input\", \"Dropdown\")
        html-tag - Keyword for the HTML tag (ignored, kept for API compatibility)

      Returns:
        A function that takes props and children, returning a dom-server Element."
     [component-type _html-tag]
     (fn [props & children]
       (apply dom/create-element component-type props children))))

#?(:clj
   (defn make-modal-stub-factory
     "Creates a CLJ stub factory for modal/overlay components.
      Returns dom-server Elements with component name as tag and props unchanged.
      Note: Unlike browser behavior, this always renders (doesn't check :open).
      Test code can check the :open prop if conditional rendering is needed.

      Args:
        component-type - String name of the component (e.g. \"Modal\", \"Popup\")

      Returns:
        A function that takes props and children, returning a dom-server Element."
     [component-type]
     (fn [props & children]
       (apply dom/create-element component-type props children))))

