(ns com.fulcrologic.semantic-ui.views.comment.ui-comment-avatar
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$CommentAvatar" :as CommentAvatar]))

  (def ui-comment-avatar
  "A comment can contain an image or avatar.

  Props:
    - as (elementType): An element type to render as (string or function).
    - className (string): Additional classes.
    - src (string): Specifies the URL of the image."
   #?(:cljs (h/factory-apply CommentAvatar)))
