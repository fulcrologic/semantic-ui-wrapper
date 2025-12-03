(ns com.fulcrologic.semantic-ui.elements.button.ui-button-or
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$ButtonOr" :as ButtonOr])))

(def ui-button-or
  "Button groups can contain conditionals.

  Props:
    - as (elementType): An element type to render as (string or function).
    - className (string): Additional classes.
    - text (number|string): Or buttons can have their text localized, or adjusted by using the text prop. ()"
  #?(:clj  (h/make-stub-factory "ButtonOr")
     :cljs (h/factory-apply ButtonOr)))
