(ns com.fulcrologic.semantic-ui.elements.label.ui-label-detail
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$LabelDetail" :as LabelDetail]))

  (def ui-label-detail
  "

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply LabelDetail)))
