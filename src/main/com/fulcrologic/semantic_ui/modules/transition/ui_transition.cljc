(ns com.fulcrologic.semantic-ui.modules.transition.ui-transition
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$Transition" :as Transition])))

  (def ui-transition
  "A transition is an animation usually used to move content in or out of view.

  Props:
    - animation (enum|string): Named animation event to used. Must be defined in CSS. (browse, browse right, drop, fade, fade up, fade down, fade left, fade right, fly up, fly down, fly left, fly right, horizontal flip, vertical flip, scale, slide up, slide down, slide left, slide right, swing up, swing down, swing left, swing right, zoom, jiggle, flash, shake, pulse, tada, bounce, glow)
    - children (element): Primary content.
    - directional (bool): Whether it is directional animation event or not. Use it only for custom transitions.
    - duration (number|shape|string): Duration of the CSS transition animation in milliseconds. ()
    - mountOnShow (bool): Wait until the first \"enter\" transition to mount the component (add it to the DOM).
    - onComplete (func): Callback on each transition that changes visibility to shown.
    - onHide (func): Callback on each transition that changes visibility to hidden.
    - onShow (func): Callback on each transition that changes visibility to shown.
    - onStart (func): Callback on animation start.
    - reactKey (string): React's key of the element.
    - transitionOnMount (bool): Run the enter animation when the component mounts, if it is initially shown.
    - unmountOnHide (bool): Unmount the component (remove it from the DOM) when it is not shown.
    - visible (bool): Show the component; triggers the enter or exit animation."
   #?(:cljs (h/factory-apply Transition)))
