(ns com.fulcrologic.semantic-ui.collections.message.ui-message-item
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$MessageItem" :as MessageItem])))

(def ui-message-item
  "A message list can contain an item.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  #?(:clj  (h/make-stub-factory "MessageItem")
     :cljs (h/factory-apply MessageItem)))
