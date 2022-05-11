(ns com.fulcrologic.semantic-ui.views.item.ui-item-extra
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$ItemExtra" :as ItemExtra]))

  (def ui-item-extra
  "An item can contain extra content meant to be formatted separately from the main content.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply ItemExtra)))
