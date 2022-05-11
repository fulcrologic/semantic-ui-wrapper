(ns com.fulcrologic.semantic-ui.collections.table.ui-table-footer
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$TableFooter" :as TableFooter]))

  (def ui-table-footer
  "A table can have a footer.

  Props:
    - as (elementType): An element type to render as (string or function)."
   #?(:cljs (h/factory-apply TableFooter)))
