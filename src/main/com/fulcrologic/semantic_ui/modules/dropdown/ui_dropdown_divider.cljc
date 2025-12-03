(ns com.fulcrologic.semantic-ui.modules.dropdown.ui-dropdown-divider
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$DropdownDivider" :as DropdownDivider])))

(def ui-dropdown-divider
  "A dropdown menu can contain dividers to separate related content.

  Props:
    - as (elementType): An element type to render as (string or function).
    - className (string): Additional classes."
  #?(:clj  (h/make-stub-factory "DropdownDivider")
     :cljs (h/factory-apply DropdownDivider)))
