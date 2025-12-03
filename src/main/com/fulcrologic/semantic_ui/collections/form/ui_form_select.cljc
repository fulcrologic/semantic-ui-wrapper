(ns com.fulcrologic.semantic-ui.collections.form.ui-form-select
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$FormSelect" :as FormSelect])))

(def ui-form-select
  "Sugar for <Form.Field control={Select} />.

  Props:
    - as (elementType): An element type to render as (string or function).
    - control (custom): A FormField control prop.
    - options (arrayOf): Array of Dropdown.Item props e.g. `{ text: '', value: '' }` ([:name \"shape\"], [:value \"Dropdown.Item.propTypes\"], [:computed true])"
  #?(:clj  (h/make-form-stub-factory "FormSelect" :select)
     :cljs (h/factory-apply FormSelect)))
