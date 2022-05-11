(ns com.fulcrologic.semantic-ui.collections.breadcrumb.ui-breadcrumb-divider
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$BreadcrumbDivider" :as BreadcrumbDivider]))

  (def ui-breadcrumb-divider
  "A divider sub-component for Breadcrumb component.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - icon (custom): Render as an `Icon` component with `divider` class instead of a `div`."
   #?(:cljs (h/factory-apply BreadcrumbDivider)))
