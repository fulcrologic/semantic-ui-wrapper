(ns com.fulcrologic.semantic-ui.collections.message.ui-message-content
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$MessageContent" :as MessageContent]))

  (def ui-message-content
  "A message can contain a content.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply MessageContent)))
