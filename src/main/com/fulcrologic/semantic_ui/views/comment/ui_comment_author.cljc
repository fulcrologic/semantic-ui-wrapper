(ns com.fulcrologic.semantic-ui.views.comment.ui-comment-author
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$CommentAuthor" :as CommentAuthor]))

  (def ui-comment-author
  "A comment can contain an author.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply CommentAuthor)))
