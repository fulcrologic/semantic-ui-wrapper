(ns com.fulcrologic.semantic-ui.elements.header.ui-header-subheader
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$HeaderSubheader" :as HeaderSubheader]))

  (def ui-header-subheader
  "Headers may contain subheaders.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply HeaderSubheader)))
