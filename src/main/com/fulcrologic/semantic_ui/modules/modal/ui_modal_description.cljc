(ns com.fulcrologic.semantic-ui.modules.modal.ui-modal-description
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$ModalDescription" :as ModalDescription])))

(def ui-modal-description
  "A modal can contain a description with one or more paragraphs.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  #?(:clj  (h/make-stub-factory "ModalDescription")
     :cljs (h/factory-apply ModalDescription)))
