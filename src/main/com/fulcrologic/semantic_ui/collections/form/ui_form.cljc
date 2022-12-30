(ns com.fulcrologic.semantic-ui.collections.form.ui-form
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    #?(:cljs ["semantic-ui-react$Form" :as Form])))

  (def ui-form
  "A Form displays a set of related user input fields in a structured way.

  Props:
    - action (string): The HTML form action
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - error (bool): Automatically show any error Message children.
    - inverted (bool): A form can have its color inverted for contrast.
    - loading (bool): Automatically show a loading indicator.
    - onSubmit (func): The HTML form submit handler.
    - reply (bool): A comment can contain a form to reply to a comment. This may have arbitrary content.
    - size (enum): A form can vary in size. (mini, tiny, small, large, big, huge, massive)
    - success (bool): Automatically show any success Message children.
    - unstackable (bool): A form can prevent itself from stacking on mobile.
    - warning (bool): Automatically show any warning Message children.
    - widths (enum): Forms can automatically divide fields to be equal width. (equal)"
   #?(:cljs (h/factory-apply Form)))
