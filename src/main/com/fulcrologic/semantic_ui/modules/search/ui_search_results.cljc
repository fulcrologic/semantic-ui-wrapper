(ns com.fulcrologic.semantic-ui.modules.search.ui-search-results
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$SearchResults" :as SearchResults])))

(def ui-search-results
  "

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  #?(:clj  (h/make-stub-factory "SearchResults")
     :cljs (h/factory-apply SearchResults)))
