(ns com.fulcrologic.semantic-ui.modules.popup.ui-popup-content
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$PopupContent" :as PopupContent]))

  (def ui-popup-content
  "A PopupContent displays the content body of a Popover.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): The content of the Popup
    - className (string): Classes to add to the Popup content className.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply PopupContent)))
