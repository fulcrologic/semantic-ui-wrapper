(ns com.fulcrologic.semantic-ui.views.comment.ui-comment-group
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$CommentGroup" :as CommentGroup]))

  (def ui-comment-group
  "Comments can be grouped.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - collapsed (bool): Comments can be collapsed, or hidden from view.
    - content (custom): Shorthand for primary content.
    - minimal (bool): Comments can hide extra information unless a user shows intent to interact with a comment.
    - size (enum): Comments can have different sizes. (mini, tiny, small, large, big, huge, massive)
    - threaded (bool): A comment list can be threaded to showing the relationship between conversations."
   #?(:cljs (h/factory-apply CommentGroup)))
