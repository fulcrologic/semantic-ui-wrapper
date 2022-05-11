(ns com.fulcrologic.semantic-ui.modules.dropdown.ui-dropdown-menu
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$DropdownMenu" :as DropdownMenu]))

  (def ui-dropdown-menu
  "A dropdown menu can contain a menu.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - direction (enum): A dropdown menu can open to the left or to the right. (left, right)
    - open (bool): Whether or not the dropdown menu is displayed.
    - scrolling (bool): A dropdown menu can scroll."
   #?(:cljs (h/factory-apply DropdownMenu)))
