(ns com.fulcrologic.semantic-ui.collections.form.ui-form-button
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$FormButton" :as FormButton])))

(def ui-form-button
  "Sugar for <Form.Field control={Button} />.

  Props:
    - as (elementType): An element type to render as (string or function).
    - control (custom): A FormField control prop."
  #?(:clj  (h/make-stub-factory "FormButton")
     :cljs (h/factory-apply FormButton)))
