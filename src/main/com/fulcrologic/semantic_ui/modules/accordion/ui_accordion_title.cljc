(ns com.fulcrologic.semantic-ui.modules.accordion.ui-accordion-title
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$AccordionTitle" :as AccordionTitle]))

  (def ui-accordion-title
  "A title sub-component for Accordion component.

  Props:
    - active (bool): Whether or not the title is in the open state.
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - icon (custom): Shorthand for Icon.
    - index (string|number): AccordionTitle index inside Accordion. ()
    - onClick (func): Called on click."
   #?(:cljs (h/factory-apply AccordionTitle)))
