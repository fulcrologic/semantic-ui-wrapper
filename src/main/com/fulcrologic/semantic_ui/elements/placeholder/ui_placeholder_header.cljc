(ns com.fulcrologic.semantic-ui.elements.placeholder.ui-placeholder-header
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$PlaceholderHeader" :as PlaceholderHeader])))

  (def ui-placeholder-header
  "A placeholder can contain a header.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - image (bool): A placeholder can contain an image."
   #?(:cljs (h/factory-apply PlaceholderHeader)))
