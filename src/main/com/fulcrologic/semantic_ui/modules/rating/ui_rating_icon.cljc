(ns com.fulcrologic.semantic-ui.modules.rating.ui-rating-icon
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$RatingIcon" :as RatingIcon])))

(def ui-rating-icon
  "An internal icon sub-component for Rating component

  Props:
    - active (bool): Indicates activity of an icon.
    - as (elementType): An element type to render as (string or function).
    - className (string): Additional classes.
    - index (number): An index of icon inside Rating.
    - onClick (func): Called on click.
    - onKeyUp (func): Called on keyup.
    - onMouseEnter (func): Called on mouseenter.
    - selected (bool): Indicates selection of an icon."
  #?(:clj  (h/make-stub-factory "RatingIcon")
     :cljs (h/factory-apply RatingIcon)))
