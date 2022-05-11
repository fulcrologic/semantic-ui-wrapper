(ns com.fulcrologic.semantic-ui.views.comment.ui-comment
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$Comment" :as Comment]))

  (def ui-comment
  "A comment displays user feedback to site content.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - collapsed (bool): Comment can be collapsed, or hidden from view.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply Comment)))
