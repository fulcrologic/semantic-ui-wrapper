(ns com.fulcrologic.semantic-ui.elements.header.ui-header-content
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$HeaderContent" :as HeaderContent]))

  (def ui-header-content
  "Header content wraps the main content when there is an adjacent Icon or Image.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply HeaderContent)))
