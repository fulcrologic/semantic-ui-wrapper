(ns com.fulcrologic.semantic-ui.addons.select.ui-select
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$Select" :as Select])))

(def ui-select
  "A Select is sugar for <Dropdown selection />.

  Props:
    - options (arrayOf): Array of Dropdown.Item props e.g. `{ text: '', value: '' }` ([:name \"shape\"], [:value \"Dropdown.Item.propTypes\"], [:computed true])"
  #?(:clj  (h/make-form-stub-factory "Select" :select)
     :cljs (h/factory-apply Select)))
