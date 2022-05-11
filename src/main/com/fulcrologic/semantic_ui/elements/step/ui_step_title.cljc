(ns com.fulcrologic.semantic-ui.elements.step.ui-step-title
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$StepTitle" :as StepTitle]))

  (def ui-step-title
  "A step can contain a title.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply StepTitle)))
