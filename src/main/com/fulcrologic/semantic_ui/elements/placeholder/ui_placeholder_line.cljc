(ns com.fulcrologic.semantic-ui.elements.placeholder.ui-placeholder-line
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$PlaceholderLine" :as PlaceholderLine]))

  (def ui-placeholder-line
  "A placeholder can contain have lines of text.

  Props:
    - as (elementType): An element type to render as (string or function).
    - className (string): Additional classes.
    - length (enum): A line can specify how long its contents should appear. (full, very long, long, medium, short, very short)"
   #?(:cljs (h/factory-apply PlaceholderLine)))
