(ns com.fulcrologic.semantic-ui.elements.placeholder.ui-placeholder-paragraph
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$PlaceholderParagraph" :as PlaceholderParagraph]))

  (def ui-placeholder-paragraph
  "A placeholder can contain a paragraph.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply PlaceholderParagraph)))
