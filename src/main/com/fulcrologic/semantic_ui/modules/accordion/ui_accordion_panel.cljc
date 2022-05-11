(ns com.fulcrologic.semantic-ui.modules.accordion.ui-accordion-panel
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$AccordionPanel" :as AccordionPanel]))

  (def ui-accordion-panel
  "A panel sub-component for Accordion component.

  Props:
    - active (bool): Whether or not the title is in the open state.
    - content (custom): A shorthand for Accordion.Content.
    - index (number|string): A panel index. ()
    - onTitleClick (func): Called when a panel title is clicked.
    - title (custom): A shorthand for Accordion.Title."
   #?(:cljs (h/factory-apply AccordionPanel)))
