(ns com.fulcrologic.semantic-ui.modules.sidebar.ui-sidebar-pusher
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$SidebarPusher" :as SidebarPusher]))

  (def ui-sidebar-pusher
  "A pushable sub-component for Sidebar.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - dimmed (bool): Controls whether or not the dim is displayed."
   #?(:cljs (h/factory-apply SidebarPusher)))
