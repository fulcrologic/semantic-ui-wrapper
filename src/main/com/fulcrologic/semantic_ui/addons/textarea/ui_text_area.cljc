(ns com.fulcrologic.semantic-ui.addons.textarea.ui-text-area
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$TextArea" :as TextArea]))

  (def ui-text-area
  "A TextArea can be used to allow for extended user input.

  Props:
    - as (elementType): An element type to render as (string or function).
    - onChange (func): Called on change.
    - onInput (func): Called on input.
    - rows (number|string): Indicates row count for a TextArea. ()
    - value (number|string): The value of the textarea. ()"
   #?(:cljs (h/wrapped-factory-apply TextArea)))
