(ns com.fulcrologic.semantic-ui.modules.dimmer.ui-dimmer
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$Dimmer" :as Dimmer])))

(def ui-dimmer
  "A dimmer hides distractions to focus attention on particular content.

  Props:
    - active (bool): An active dimmer will dim its parent container.
    - page (bool): A dimmer can be formatted to be fixed to the page."
  #?(:clj  (h/make-modal-stub-factory "Dimmer")
     :cljs (h/factory-apply Dimmer)))
