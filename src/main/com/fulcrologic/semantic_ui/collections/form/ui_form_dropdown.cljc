(ns com.fulcrologic.semantic-ui.collections.form.ui-form-dropdown
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$FormDropdown" :as FormDropdown]))

  (def ui-form-dropdown
  "Sugar for <Form.Field control={Dropdown} />.

  Props:
    - as (elementType): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   #?(:cljs (h/factory-apply FormDropdown)))
