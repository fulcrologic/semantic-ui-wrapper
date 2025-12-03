(ns fulcrologic.semantic-ui.workspaces.icon
  (:require [clojure.string :as string]
            [com.fulcrologic.fulcro.components :as fp]
            [com.fulcrologic.fulcro.dom :as dom]
            [com.fulcrologic.semantic-ui.elements.icon.ui-icon :refer [ui-icon]]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.core :as ws]))

(fp/defsc Icons
  [this {:keys [x]}]
  {:initial-state (fn [_] {:x "x"})
   :ident         (fn [] [::id "singleton"])
   :query         [:x]}
  (let [icons (ns-publics 'com.fulcrologic.semantic-ui.icons)]
    (dom/div
      {}
      (mapv #(ui-icon {:name (-> % last meta :name name
                               (string/replace #"-icon" "")
                               (string/replace #"-" " ")
                               (string/replace #"_" "")
                               (string/replace #"wi fi" "wi-fi"))
                       :key  (-> % last meta :name)})
        (sort-by #(-> % first) icons)))))

(ws/defcard icons
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       Icons}))

