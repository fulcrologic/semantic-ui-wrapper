(ns com.fulcrologic.semantic-ui.views.feed.ui-feed-summary
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$FeedSummary" :as FeedSummary]))

  (def ui-feed-summary
  "A feed can contain a summary.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - date (custom): Shorthand for FeedDate.
    - user (custom): Shorthand for FeedUser."
   #?(:cljs (h/factory-apply FeedSummary)))
