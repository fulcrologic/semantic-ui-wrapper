(ns com.fulcrologic.semantic-ui.views.card.ui-card-meta
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$CardMeta" :as CardMeta]))

  (def ui-card-meta
  "A card can contain content metadata.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - textAlign (enum): A card meta can adjust its text alignment. (left, center, right)"
   #?(:cljs (h/factory-apply CardMeta)))
