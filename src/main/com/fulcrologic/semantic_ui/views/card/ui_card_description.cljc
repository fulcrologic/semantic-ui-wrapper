(ns com.fulcrologic.semantic-ui.views.card.ui-card-description
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$CardDescription" :as CardDescription]))

  (def ui-card-description
  "A card can contain a description with one or more paragraphs.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - textAlign (enum): A card content can adjust its text alignment. (left, center, right)"
   #?(:cljs (h/factory-apply CardDescription)))
