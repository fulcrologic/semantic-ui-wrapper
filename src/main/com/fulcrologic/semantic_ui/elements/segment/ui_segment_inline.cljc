(ns com.fulcrologic.semantic-ui.elements.segment.ui-segment-inline
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$SegmentInline" :as SegmentInline]))

  (def ui-segment-inline
  "A placeholder segment can be inline.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply SegmentInline)))
