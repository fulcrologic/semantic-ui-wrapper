(ns com.fulcrologic.semantic-ui.collections.form.ui-form-text-area
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$FormTextArea" :as FormTextArea]))

  (def ui-form-text-area
  "Sugar for <Form.Field control={TextArea} />.

  Props:
    - as (elementType): An element type to render as (string or function).
    - control (custom): A FormField control prop."
   #?(:cljs (h/factory-apply FormTextArea)))
