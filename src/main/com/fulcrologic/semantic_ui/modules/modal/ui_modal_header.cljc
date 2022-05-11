(ns com.fulcrologic.semantic-ui.modules.modal.ui-modal-header
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$ModalHeader" :as ModalHeader]))

  (def ui-modal-header
  "A modal can have a header.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply ModalHeader)))
