(ns com.fulcrologic.semantic-ui.modules.transition.ui-transition-group
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$TransitionGroup" :as TransitionGroup]))

  (def ui-transition-group
  "A Transition.Group animates children as they mount and unmount.

  Props:
    - animation (enum|string): Named animation event to used. Must be defined in CSS. (browse, browse right, drop, fade, fade up, fade down, fade left, fade right, fly up, fly down, fly left, fly right, horizontal flip, vertical flip, scale, slide up, slide down, slide left, slide right, swing up, swing down, swing left, swing right, zoom, jiggle, flash, shake, pulse, tada, bounce, glow)
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - directional (bool): Whether it is directional animation event or not. Use it only for custom transitions.
    - duration (number|shape|string): Duration of the CSS transition animation in milliseconds. ()"
   #?(:cljs (h/factory-apply TransitionGroup)))
