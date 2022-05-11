(ns com.fulcrologic.semantic-ui.elements.image.ui-image-group
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$ImageGroup" :as ImageGroup]))

  (def ui-image-group
  "A group of images.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - size (enum): A group of images can be formatted to have the same size. (mini, tiny, small, medium, large, big, huge, massive)"
   #?(:cljs (h/factory-apply ImageGroup)))
