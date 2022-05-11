(ns com.fulcrologic.semantic-ui.elements.button.ui-button-content
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$ButtonContent" :as ButtonContent]))

  (def ui-button-content
  "Used in some Button types, such as `animated`.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - hidden (bool): Initially hidden, visible on hover.
    - visible (bool): Initially visible, hidden on hover."
   #?(:cljs (h/factory-apply ButtonContent)))
