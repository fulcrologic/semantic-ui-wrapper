(ns com.fulcrologic.semantic-ui.elements.list.ui-list-list
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$ListList" :as ListList]))

  (def ui-list-list
  "A list can contain a sub list.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply ListList)))
