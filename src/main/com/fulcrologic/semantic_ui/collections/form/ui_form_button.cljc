(ns com.fulcrologic.semantic-ui.collections.form.ui-form-button
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$FormButton" :as FormButton]))

  (def ui-form-button
  "Sugar for <Form.Field control={Button} />.

  Props:
    - as (elementType): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   #?(:cljs (h/factory-apply FormButton)))
