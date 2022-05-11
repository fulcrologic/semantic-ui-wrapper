(ns com.fulcrologic.semantic-ui.modules.tab.ui-tab-pane
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$TabPane" :as TabPane]))

  (def ui-tab-pane
  "A tab pane holds the content of a tab.

  Props:
    - active (bool): A tab pane can be active.
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - loading (bool): A Tab.Pane can display a loading indicator."
   #?(:cljs (h/factory-apply TabPane)))
