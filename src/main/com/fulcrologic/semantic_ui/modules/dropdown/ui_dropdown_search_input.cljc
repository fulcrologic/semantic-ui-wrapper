(ns com.fulcrologic.semantic-ui.modules.dropdown.ui-dropdown-search-input
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$DropdownSearchInput" :as DropdownSearchInput]))

  (def ui-dropdown-search-input
  "A search item sub-component for Dropdown component.

  Props:
    - as (elementType): An element type to render as (string or function).
    - autoComplete (string): An input can have the auto complete.
    - className (string): Additional classes.
    - tabIndex (number|string): An input can receive focus. ()
    - type (string): The HTML input type.
    - value (number|string): Stored value. ()"
   #?(:cljs (h/wrapped-factory-apply DropdownSearchInput)))
