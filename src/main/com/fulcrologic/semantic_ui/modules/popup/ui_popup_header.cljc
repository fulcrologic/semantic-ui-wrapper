(ns com.fulcrologic.semantic-ui.modules.popup.ui-popup-header
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$PopupHeader" :as PopupHeader]))

  (def ui-popup-header
  "A PopupHeader displays a header in a Popover.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply PopupHeader)))
