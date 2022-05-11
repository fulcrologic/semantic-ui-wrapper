(ns com.fulcrologic.semantic-ui.modules.popup.ui-popup
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$Popup" :as Popup]))

  (def ui-popup
  "A Popup displays additional information on top of a page.

  Props:
    - as (elementType): An element type to render as (string or function).
    - basic (bool): Display the popup without the pointing arrow.
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Simple text content for the popover.
    - context (object|custom): Existing element the pop-up should be bound to. ()
    - disabled (bool): A disabled popup only renders its trigger.
    - eventsEnabled (bool): Enables the Popper.js event listeners.
    - flowing (bool): A flowing Popup has no maximum width and continues to flow to fit its content.
    - header (custom): Header displayed above the content in bold.
    - hideOnScroll (bool): Hide the Popup when scrolling the window.
    - hoverable (bool): Whether the popup should not close on hover.
    - inverted (bool): Invert the colors of the Popup.
    - offset (func|arrayOf): Offset values in px unit to apply to rendered popup. The basic offset accepts an ()
    - on (enum|arrayOf): Events triggering the popup. (hover, click, focus)
    - onClose (func): Called when a close event happens.
    - onMount (func): Called when the portal is mounted on the DOM.
    - onOpen (func): Called when an open event happens.
    - onUnmount (func): Called when the portal is unmounted from the DOM.
    - pinned (bool): Disables automatic repositioning of the component, it will always be placed according to the position value.
    - popper (custom): A wrapping element for an actual content that will be used for positioning.
    - popperDependencies (array): A popup can have dependencies which update will schedule a position update.
    - popperModifiers (array): An array containing custom settings for the Popper.js modifiers.
    - position (enum): Position for the popover. (top center, top left, top right, bottom center, bottom left, bottom right, right center, left center)
    - positionFixed (bool): Tells `Popper.js` to use the `position: fixed` strategy to position the popover.
    - size (enum): Popup size. (mini, tiny, small, large, huge)
    - style (object): Custom Popup style.
    - trigger (node): Element to be rendered in-place where the popup is defined.
    - wide (bool|enum): Popup width. (very)"
   #?(:cljs (h/factory-apply Popup)))
