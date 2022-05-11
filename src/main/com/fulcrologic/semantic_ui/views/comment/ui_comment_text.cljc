(ns com.fulcrologic.semantic-ui.views.comment.ui-comment-text
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$CommentText" :as CommentText]))

  (def ui-comment-text
  "A comment can contain text.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply CommentText)))
