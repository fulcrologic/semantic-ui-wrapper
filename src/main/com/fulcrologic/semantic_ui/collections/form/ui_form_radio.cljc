(ns com.fulcrologic.semantic-ui.collections.form.ui-form-radio
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$FormRadio" :as FormRadio])))

(def ui-form-radio
  "Sugar for <Form.Field control={Radio} />.

  Props:
    - as (elementType): An element type to render as (string or function).
    - control (custom): A FormField control prop."
  #?(:clj  (h/make-form-stub-factory "FormRadio" :checkbox)
     :cljs (h/factory-apply FormRadio)))
