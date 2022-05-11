(ns com.fulcrologic.semantic-ui.elements.placeholder.ui-placeholder-image
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$PlaceholderImage" :as PlaceholderImage]))

  (def ui-placeholder-image
  "A placeholder can contain an image.

  Props:
    - as (elementType): An element type to render as (string or function).
    - className (string): Additional classes.
    - rectangular (bool): An image can modify size correctly with responsive styles. ()
    - square (bool): An image can modify size correctly with responsive styles. ()"
   #?(:cljs (h/factory-apply PlaceholderImage)))
