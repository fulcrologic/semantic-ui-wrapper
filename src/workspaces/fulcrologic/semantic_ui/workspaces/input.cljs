(ns fulcrologic.semantic-ui.workspaces.input
  (:require [com.fulcrologic.fulcro.components :as fp]
            [com.fulcrologic.fulcro.dom :as dom]
            [com.fulcrologic.fulcro.mutations :as fm]
            [com.fulcrologic.semantic-ui.elements.input.ui-input :refer [ui-input]]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.core :as ws]))

(fp/defsc Input
  [this {:keys [my-val]}]
  {:initial-state (fn [_] {:my-val ""})
   :ident         (fn [] [::id "singleton"])
   :query         [:my-val]}
  (dom/div
    (ui-input {:value my-val :onChange #(fm/set-string! this :my-val :event %)})))

(ws/defcard input
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       Input}))

