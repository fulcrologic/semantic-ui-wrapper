(ns com.fulcrologic.semantic-ui.views.comment.ui-comment-actions
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$CommentActions" :as CommentActions]))

  (def ui-comment-actions
  "A comment can contain an list of actions a user may perform related to this comment.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply CommentActions)))
