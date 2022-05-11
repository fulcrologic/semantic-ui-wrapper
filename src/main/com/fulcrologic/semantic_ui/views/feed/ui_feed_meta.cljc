(ns com.fulcrologic.semantic-ui.views.feed.ui-feed-meta
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$FeedMeta" :as FeedMeta]))

  (def ui-feed-meta
  "A feed can contain a meta.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - like (custom): Shorthand for FeedLike."
   #?(:cljs (h/factory-apply FeedMeta)))
