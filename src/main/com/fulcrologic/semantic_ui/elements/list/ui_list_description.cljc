(ns com.fulcrologic.semantic-ui.elements.list.ui-list-description
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$ListDescription" :as ListDescription]))

  (def ui-list-description
  "A list item can contain a description.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply ListDescription)))
