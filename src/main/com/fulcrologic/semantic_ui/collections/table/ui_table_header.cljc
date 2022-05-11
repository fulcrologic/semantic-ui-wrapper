(ns com.fulcrologic.semantic-ui.collections.table.ui-table-header
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$TableHeader" :as TableHeader]))

  (def ui-table-header
  "A table can have a header.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - fullWidth (bool): A definition table can have a full width header or footer, filling in the gap left by the first column."
   #?(:cljs (h/factory-apply TableHeader)))
