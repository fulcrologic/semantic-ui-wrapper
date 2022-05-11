(ns com.fulcrologic.semantic-ui.collections.table.ui-table-header-cell
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$TableHeaderCell" :as TableHeaderCell]))

  (def ui-table-header-cell
  "A table can have a header cell.

  Props:
    - as (elementType): An element type to render as (string or function).
    - className (string): Additional classes.
    - sorted (enum): A header cell can be sorted in ascending or descending order. (ascending, descending)"
   #?(:cljs (h/factory-apply TableHeaderCell)))
