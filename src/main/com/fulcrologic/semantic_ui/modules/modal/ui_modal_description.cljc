(ns com.fulcrologic.semantic-ui.modules.modal.ui-modal-description
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$ModalDescription" :as ModalDescription]))

  (def ui-modal-description
  "A modal can contain a description with one or more paragraphs.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply ModalDescription)))
