(ns com.fulcrologic.semantic-ui.modules.tab.ui-tab
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$Tab" :as Tab]))

  (def ui-tab
  "A Tab is a hidden section of content activated by a Menu.

  Props:
    - activeIndex (number|string): Index of the currently active tab. ()
    - as (elementType): An element type to render as (string or function).
    - defaultActiveIndex (number|string): The initial activeIndex. ()
    - grid (object): Shorthand props for the Grid. Only applicable to vertical menus.
    - menu (object): Shorthand props for the Menu.
    - menuPosition (enum): Align vertical menu (left, right)
    - onTabChange (func): Called on tab change.
    - panes (arrayOf): Array of objects describing each Menu.Item and Tab.Pane: ([:name \"shape\"], [:value {:menuItem {:name \"custom\", :raw \"customPropTypes.itemShorthand\", :required false}, :pane {:name \"custom\", :raw \"customPropTypes.itemShorthand\", :required false}, :render {:name \"func\", :required false}}])
    - renderActiveOnly (bool): A Tab can render only active pane."
   #?(:cljs (h/factory-apply Tab)))
