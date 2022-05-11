(ns com.fulcrologic.semantic-ui.views.feed.ui-feed
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$Feed" :as Feed]))

  (def ui-feed
  "A feed presents user activity chronologically.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - events (custom): Shorthand array of props for FeedEvent.
    - size (enum): A feed can have different sizes. (small, large)"
   #?(:cljs (h/factory-apply Feed)))
