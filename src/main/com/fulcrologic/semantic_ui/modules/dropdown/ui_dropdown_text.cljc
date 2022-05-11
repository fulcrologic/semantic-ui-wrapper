(ns com.fulcrologic.semantic-ui.modules.dropdown.ui-dropdown-text
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$DropdownText" :as DropdownText]))

  (def ui-dropdown-text
  "A dropdown contains a selected value.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply DropdownText)))
