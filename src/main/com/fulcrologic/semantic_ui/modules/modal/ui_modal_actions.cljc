(ns com.fulcrologic.semantic-ui.modules.modal.ui-modal-actions
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$ModalActions" :as ModalActions]))

  (def ui-modal-actions
  "A modal can contain a row of actions.

  Props:
    - actions (custom): Array of shorthand buttons.
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - onActionClick (func): Action onClick handler when using shorthand `actions`. ()"
   #?(:cljs (h/factory-apply ModalActions)))
