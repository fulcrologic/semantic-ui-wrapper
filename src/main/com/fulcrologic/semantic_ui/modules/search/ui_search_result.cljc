(ns com.fulcrologic.semantic-ui.modules.search.ui-search-result
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$SearchResult" :as SearchResult]))

  (def ui-search-result
  "

  Props:
    - active (bool): The item currently selected by keyboard shortcut.
    - as (elementType): An element type to render as (string or function).
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (string): Additional text with less emphasis.
    - id (number|string): A unique identifier. ()
    - image (string): Add an image to the item.
    - onClick (func): Called on click.
    - price (string): Customized text for price.
    - renderer (func): Renders the result contents.
    - title (string): Display title."
   #?(:cljs (h/factory-apply SearchResult)))
