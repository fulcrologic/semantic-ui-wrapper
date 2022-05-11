(ns com.fulcrologic.semantic-ui.views.item.ui-item-header
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$ItemHeader" :as ItemHeader]))

  (def ui-item-header
  "An item can contain a header.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply ItemHeader)))
