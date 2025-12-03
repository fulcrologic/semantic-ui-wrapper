(ns com.fulcrologic.semantic-ui.views.feed.ui-feed-date
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$FeedDate" :as FeedDate])))

(def ui-feed-date
  "An event or an event summary can contain a date.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  #?(:clj  (h/make-stub-factory "FeedDate")
     :cljs (h/factory-apply FeedDate)))
