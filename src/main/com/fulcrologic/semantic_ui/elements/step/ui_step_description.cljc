(ns com.fulcrologic.semantic-ui.elements.step.ui-step-description
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$StepDescription" :as StepDescription])))

(def ui-step-description
  "

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  #?(:clj  (h/make-stub-factory "StepDescription")
     :cljs (h/factory-apply StepDescription)))
