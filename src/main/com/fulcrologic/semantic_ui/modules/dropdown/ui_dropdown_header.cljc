(ns com.fulcrologic.semantic-ui.modules.dropdown.ui-dropdown-header
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$DropdownHeader" :as DropdownHeader])))

(def ui-dropdown-header
  "A dropdown menu can contain a header.

  Props:
    - as (elementType): An element type to render as (string or function)
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - icon (custom): Shorthand for Icon."
  #?(:clj  (h/make-stub-factory "DropdownHeader")
     :cljs (h/factory-apply DropdownHeader)))
