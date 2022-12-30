(ns com.fulcrologic.semantic-ui.elements.label.ui-label-group
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$LabelGroup" :as LabelGroup])))

  (def ui-label-group
  "A label can be grouped.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - circular (bool): Labels can share shapes.
    - className (string): Additional classes.
    - color (enum): Label group can share colors together. (red, orange, yellow, olive, green, teal, blue, violet, purple, pink, brown, grey, black)
    - content (custom): Shorthand for primary content.
    - size (enum): Label group can share sizes together. (mini, tiny, small, medium, large, big, huge, massive)
    - tag (bool): Label group can share tag formatting."
   #?(:cljs (h/factory-apply LabelGroup)))
