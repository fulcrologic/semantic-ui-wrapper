(ns com.fulcrologic.semantic-ui.views.feed.ui-feed-extra
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$FeedExtra" :as FeedExtra]))

  (def ui-feed-extra
  "A feed can contain an extra content.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - images (union): An event can contain additional information like a set of images. ()
    - text (bool): An event can contain additional text information."
   #?(:cljs (h/factory-apply FeedExtra)))
