(ns com.fulcrologic.semantic-ui.modules.accordion.ui-accordion
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$Accordion" :as Accordion])))

(def ui-accordion
  "An accordion allows users to toggle the display of sections of content.

  Props:
    - className (string): Additional classes.
    - fluid (bool): Format to take up the width of its container.
    - inverted (bool): Format for dark backgrounds.
    - styled (bool): Adds some basic styling to accordion panels."
  #?(:clj  (h/make-stub-factory "Accordion")
     :cljs (h/factory-apply Accordion)))
