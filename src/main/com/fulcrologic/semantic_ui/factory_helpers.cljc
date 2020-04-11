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

