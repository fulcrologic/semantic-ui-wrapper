(ns com.fulcrologic.semantic-ui.collections.menu.ui-menu-header
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$MenuHeader" :as MenuHeader]))

  (def ui-menu-header
  "A menu item may include a header or may itself be a header.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply MenuHeader)))
