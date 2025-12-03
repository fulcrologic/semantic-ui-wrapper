(ns com.fulcrologic.semantic-ui.modules.accordion.ui-accordion-accordion
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$AccordionAccordion" :as AccordionAccordion])))

(def ui-accordion-accordion
  "An Accordion can contain sub-accordions.

  Props:
    - activeIndex (union): Index of the currently active panel. ()
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - defaultActiveIndex (union): Initial activeIndex value. ()
    - exclusive (bool): Only allow one panel open at a time.
    - onTitleClick (func): Called when a panel title is clicked. ()
    - panels (arrayOf): Shorthand array of props for Accordion. ()"
  #?(:clj  (h/make-stub-factory "AccordionAccordion")
     :cljs (h/factory-apply AccordionAccordion)))
