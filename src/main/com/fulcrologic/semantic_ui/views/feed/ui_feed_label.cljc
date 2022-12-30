(ns com.fulcrologic.semantic-ui.views.feed.ui-feed-label
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$FeedLabel" :as FeedLabel])))

  (def ui-feed-label
  "An event can contain an image or icon label.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - icon (custom): An event can contain icon label.
    - image (custom): An event can contain image label."
   #?(:cljs (h/factory-apply FeedLabel)))
