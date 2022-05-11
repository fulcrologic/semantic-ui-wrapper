(ns com.fulcrologic.semantic-ui.views.comment.ui-comment-action
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$CommentAction" :as CommentAction]))

  (def ui-comment-action
  "A comment can contain an action.

  Props:
    - active (bool): Style as the currently active action.
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply CommentAction)))
