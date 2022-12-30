(ns com.fulcrologic.semantic-ui.addons.transitionableportal.ui-transitionable-portal
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$TransitionablePortal" :as TransitionablePortal])))

  (def ui-transitionable-portal
  "A sugar for `Portal` and `Transition`.

  Props:
    - children (node): Primary content.
    - onClose (func): Called when a close event happens.
    - onHide (func): Callback on each transition that changes visibility to hidden.
    - onOpen (func): Called when an open event happens.
    - onStart (func): Callback on animation start.
    - open (bool): Controls whether or not the portal is displayed.
    - transition (object): Transition props."
   #?(:cljs (h/factory-apply TransitionablePortal)))
