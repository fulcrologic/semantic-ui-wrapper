(ns com.fulcrologic.semantic-ui.views.card.ui-card-header
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$CardHeader" :as CardHeader])))

(def ui-card-header
  "A card can contain a header.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - textAlign (enum): A card header can adjust its text alignment. (left, center, right)"
  #?(:clj  (h/make-stub-factory "CardHeader")
     :cljs (h/factory-apply CardHeader)))
