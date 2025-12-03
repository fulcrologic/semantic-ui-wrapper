(ns com.fulcrologic.semantic-ui.views.item.ui-item-image
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$ItemImage" :as ItemImage])))

(def ui-item-image
  "An item can contain an image.

  Props:
    - size (custom): An image may appear at different sizes."
  #?(:clj  (h/make-stub-factory "ItemImage")
     :cljs (h/factory-apply ItemImage)))
