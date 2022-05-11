(ns com.fulcrologic.semantic-ui.modules.sidebar.ui-sidebar-pushable
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$SidebarPushable" :as SidebarPushable]))

  (def ui-sidebar-pushable
  "A pushable sub-component for Sidebar.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply SidebarPushable)))
