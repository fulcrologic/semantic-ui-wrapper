(ns com.fulcrologic.semantic-ui.modules.search.ui-search-category-layout
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$SearchCategoryLayout" :as SearchCategoryLayout]))

  (def ui-search-category-layout
  "

  Props:
    - categoryContent (element): The rendered category content
    - resultsContent (element): The rendered results content"
   #?(:cljs (h/factory-apply SearchCategoryLayout)))
