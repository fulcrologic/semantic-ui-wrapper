(ns com.fulcrologic.semantic-ui.collections.table.ui-table-footer
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$TableFooter" :as TableFooter])))

(def ui-table-footer
  "A table can have a footer.

  Props:
    - as (elementType): An element type to render as (string or function)."
  #?(:clj  (h/make-stub-factory "TableFooter")
     :cljs (h/factory-apply TableFooter)))
