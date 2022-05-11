(ns com.fulcrologic.semantic-ui.elements.reveal.ui-reveal-content
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$RevealContent" :as RevealContent]))

  (def ui-reveal-content
  "A content sub-component for the Reveal.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - hidden (bool): A reveal may contain content that is visible before interaction.
    - visible (bool): A reveal may contain content that is hidden before user interaction."
   #?(:cljs (h/factory-apply RevealContent)))
