(ns com.fulcrologic.semantic-ui.modules.modal.ui-modal
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$Modal" :as Modal]))

  (def ui-modal
  "A modal displays content that temporarily blocks interactions with the main view of a site.

  Props:
    - actions (custom): Shorthand for Modal.Actions. Typically an array of button shorthand.
    - as (elementType): An element type to render as (string or function).
    - basic (bool): A modal can reduce its complexity
    - centered (bool): A modal can be vertically centered in the viewport
    - children (node): Primary content.
    - className (string): Additional classes.
    - closeIcon (node|object|bool): Shorthand for the close icon. Closes the modal on click. ()
    - closeOnDimmerClick (bool): Whether or not the Modal should close when the dimmer is clicked.
    - closeOnDocumentClick (bool): Whether or not the Modal should close when the document is clicked.
    - content (custom): Simple text content for the Modal.
    - defaultOpen (bool): Initial value of open.
    - dimmer (bool|func|object|enum): A Modal can appear in a dimmer. (inverted, blurring)
    - eventPool (string): Event pool namespace that is used to handle component events
    - header (custom): Modal displayed above the content in bold.
    - mountNode (any): The node where the modal should mount. Defaults to document.body.
    - onActionClick (func): Action onClick handler when using shorthand `actions`.
    - onClose (func): Called when a close event happens.
    - onMount (func): Called when the modal is mounted on the DOM.
    - onOpen (func): Called when an open event happens.
    - onUnmount (func): Called when the modal is unmounted from the DOM.
    - open (bool): Controls whether or not the Modal is displayed.
    - size (enum): A modal can vary in size (mini, tiny, small, large, fullscreen)
    - style (object): Custom styles.
    - trigger (node): Element to be rendered in-place where the modal is defined."
   #?(:cljs (h/factory-apply Modal)))
