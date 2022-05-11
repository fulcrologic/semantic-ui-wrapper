(ns com.fulcrologic.semantic-ui.modules.search.ui-search-category
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$SearchCategory" :as SearchCategory]))

  (def ui-search-category
  "

  Props:
    - active (bool): The item currently selected by keyboard shortcut.
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - layoutRenderer (func): Renders the category layout contents.
    - name (string): Display name.
    - renderer (func): Renders the category contents.
    - results (array): Array of Search.Result props."
   #?(:cljs (h/factory-apply SearchCategory)))
