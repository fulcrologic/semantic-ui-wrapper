(ns com.fulcrologic.semantic-ui.collections.form.ui-form-field
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$FormField" :as FormField]))

  (def ui-form-field
  "A field is a form element containing a label and an input.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - control (elementType|enum): A form control component (i.e. Dropdown) or HTML tagName (i.e. 'input'). (button, input, select, textarea)
    - disabled (bool): Individual fields may be disabled.
    - error (bool|custom): Individual fields may display an error state along with a message. ()
    - id (string): The id of the control
    - inline (bool): A field can have its label next to instead of above it.
    - label (node|object): Mutually exclusive with children. ()
    - required (bool): A field can show that input is mandatory.
    - type (): Passed to the control component (i.e. <input type='password' />) ()
    - width (enum): A field can specify its width in grid columns (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen)"
   #?(:cljs (h/factory-apply FormField)))
