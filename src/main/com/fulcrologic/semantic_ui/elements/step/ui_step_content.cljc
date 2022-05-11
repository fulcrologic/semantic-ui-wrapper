(ns com.fulcrologic.semantic-ui.elements.step.ui-step-content
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$StepContent" :as StepContent]))

  (def ui-step-content
  "A step can contain a content.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for StepDescription.
    - title (custom): Shorthand for StepTitle."
   #?(:cljs (h/factory-apply StepContent)))
