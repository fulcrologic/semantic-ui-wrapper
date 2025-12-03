(ns com.fulcrologic.semantic-ui.views.comment.ui-comment-metadata
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$CommentMetadata" :as CommentMetadata])))

(def ui-comment-metadata
  "A comment can contain metadata about the comment, an arbitrary amount of metadata may be defined.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  #?(:clj  (h/make-stub-factory "CommentMetadata")
     :cljs (h/factory-apply CommentMetadata)))
