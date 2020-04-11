(ns com.fulcrologic.semantic-ui.collections.form.ui-form-checkbox
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Form/FormCheckbox" :default FormCheckbox]))

  (def ui-form-checkbox
  "Sugar for <Form.Field control={Checkbox} />.

  Props:
    - as (elementType): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   #?(:cljs (h/factory-apply FormCheckbox)))
