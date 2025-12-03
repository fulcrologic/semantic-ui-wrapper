(ns com.fulcrologic.semantic-ui.views.item.ui-item-meta
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$ItemMeta" :as ItemMeta])))

(def ui-item-meta
  "An item can contain content metadata.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
  #?(:clj  (h/make-stub-factory "ItemMeta")
     :cljs (h/factory-apply ItemMeta)))
