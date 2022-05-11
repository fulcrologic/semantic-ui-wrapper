(ns com.fulcrologic.semantic-ui.views.feed.ui-feed-like
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$FeedLike" :as FeedLike]))

  (def ui-feed-like
  "A feed can contain a like element.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - icon (custom): Shorthand for icon. Mutually exclusive with children."
   #?(:cljs (h/factory-apply FeedLike)))
