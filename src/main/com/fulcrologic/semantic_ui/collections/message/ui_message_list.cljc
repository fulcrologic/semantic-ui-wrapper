(ns com.fulcrologic.semantic-ui.collections.message.ui-message-list
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$MessageList" :as MessageList])))

  (def ui-message-list
  "A message can contain a list of items.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - items (custom): Shorthand Message.Items."
   #?(:cljs (h/factory-apply MessageList)))
