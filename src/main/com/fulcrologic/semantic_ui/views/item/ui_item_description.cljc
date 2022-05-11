(ns com.fulcrologic.semantic-ui.views.item.ui-item-description
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$ItemDescription" :as ItemDescription]))

  (def ui-item-description
  "An item can contain a description with a single or multiple paragraphs.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply ItemDescription)))
