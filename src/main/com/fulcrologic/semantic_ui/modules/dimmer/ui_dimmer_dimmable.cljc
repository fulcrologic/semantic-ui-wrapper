(ns com.fulcrologic.semantic-ui.modules.dimmer.ui-dimmer-dimmable
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$DimmerDimmable" :as DimmerDimmable])))

  (def ui-dimmer-dimmable
  "A dimmable sub-component for Dimmer.

  Props:
    - as (elementType): An element type to render as (string or function).
    - blurring (bool): A dimmable element can blur its contents.
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - dimmed (bool): Controls whether or not the dim is displayed."
   #?(:cljs (h/factory-apply DimmerDimmable)))
