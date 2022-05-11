(ns com.fulcrologic.semantic-ui.elements.list.ui-list-content
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$ListContent" :as ListContent]))

  (def ui-list-content
  "A list item can contain a content.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for ListDescription.
    - floated (enum): An list content can be floated left or right. (left, right)
    - header (custom): Shorthand for ListHeader.
    - verticalAlign (enum): An element inside a list can be vertically aligned. (bottom, middle, top)"
   #?(:cljs (h/factory-apply ListContent)))
