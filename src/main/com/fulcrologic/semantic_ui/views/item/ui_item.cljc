(ns com.fulcrologic.semantic-ui.views.item.ui-item
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$Item" :as Item]))

  (def ui-item
  "An item view presents large collections of site content for display.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for ItemContent component.
    - description (custom): Shorthand for ItemDescription component.
    - extra (custom): Shorthand for ItemExtra component.
    - header (custom): Shorthand for ItemHeader component.
    - image (custom): Shorthand for ItemImage component.
    - meta (custom): Shorthand for ItemMeta component."
   #?(:cljs (h/factory-apply Item)))
