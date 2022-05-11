(ns com.fulcrologic.semantic-ui.collections.form.ui-form-input
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$FormInput" :as FormInput]))

  (def ui-form-input
  "Sugar for <Form.Field control={Input} />.

  Props:
    - as (elementType): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   #?(:cljs (h/wrapped-factory-apply FormInput)))
