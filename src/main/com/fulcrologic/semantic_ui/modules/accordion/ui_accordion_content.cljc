(ns com.fulcrologic.semantic-ui.modules.accordion.ui-accordion-content
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$AccordionContent" :as AccordionContent]))

  (def ui-accordion-content
  "A content sub-component for Accordion component.

  Props:
    - active (bool): Whether or not the content is visible.
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply AccordionContent)))
