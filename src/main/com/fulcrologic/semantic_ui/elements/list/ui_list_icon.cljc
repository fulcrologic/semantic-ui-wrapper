(ns com.fulcrologic.semantic-ui.elements.list.ui-list-icon
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$ListIcon" :as ListIcon])))

(def ui-list-icon
  "A list item can contain an icon.

  Props:
    - className (string): Additional classes.
    - verticalAlign (enum): An element inside a list can be vertically aligned. (bottom, middle, top)"
  #?(:clj  (h/make-stub-factory "ListIcon")
     :cljs (h/factory-apply ListIcon)))
