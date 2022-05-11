(ns com.fulcrologic.semantic-ui.modules.modal.ui-modal-content
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$ModalContent" :as ModalContent]))

  (def ui-modal-content
  "A modal can contain content.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - image (bool): A modal can contain image content.
    - scrolling (bool): A modal can use the entire size of the screen."
   #?(:cljs (h/factory-apply ModalContent)))
