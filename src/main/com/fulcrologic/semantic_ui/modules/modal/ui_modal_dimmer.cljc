(ns com.fulcrologic.semantic-ui.modules.modal.ui-modal-dimmer
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$ModalDimmer" :as ModalDimmer]))

  (def ui-modal-dimmer
  "A modal has a dimmer.

  Props:
    - as (elementType): An element type to render as (string or function).
    - blurring (bool): A dimmer can be blurred.
    - centered (bool): A dimmer can center its contents in the viewport.
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - inverted (bool): A dimmer can be inverted.
    - mountNode (any): The node where the modal should mount. Defaults to document.body.
    - scrolling (bool): A dimmer can make body scrollable."
   #?(:cljs (h/factory-apply ModalDimmer)))
