(ns com.fulcrologic.semantic-ui.collections.table.ui-table-row
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$TableRow" :as TableRow]))

  (def ui-table-row
  "A table can have rows.

  Props:
    - active (bool): A row can be active or selected by a user.
    - as (elementType): An element type to render as (string or function).
    - cellAs (elementType): An element type to render as (string or function).
    - cells (custom): Shorthand array of props for TableCell.
    - children (node): Primary content.
    - className (string): Additional classes.
    - disabled (bool): A row can be disabled.
    - error (bool): A row may call attention to an error or a negative value.
    - negative (bool): A row may let a user know whether a value is bad.
    - positive (bool): A row may let a user know whether a value is good.
    - textAlign (enum): A table row can adjust its text alignment. (left, center, right)
    - verticalAlign (enum): A table row can adjust its vertical alignment. (bottom, middle, top)
    - warning (bool): A row may warn a user."
   #?(:cljs (h/factory-apply TableRow)))
