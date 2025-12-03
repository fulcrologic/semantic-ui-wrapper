(ns fulcrologic.semantic-ui.workspaces.form
  (:require [com.fulcrologic.fulcro.components :as fp]
            [com.fulcrologic.fulcro.dom :as dom]
            [com.fulcrologic.fulcro.mutations :as fm]
            [com.fulcrologic.semantic-ui.collections.form.ui-form :refer [ui-form]]
            [com.fulcrologic.semantic-ui.collections.form.ui-form-input :refer [ui-form-input]]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.core :as ws]))

(fp/defsc FormInput
  [this {:keys [my-x-val my-y-val]}]
  {:initial-state (fn [_] {:my-x-val "" :my-y-val ""})
   :ident         (fn [] [::id "singleton-form-input"])
   :query         [:my-x-val :my-y-val]}
  (let [on-x-change (fn [evt _] (fm/set-string! this :my-x-val :event evt))
        on-y-change (fn [evt _] (fm/set-string! this :my-y-val :event evt))]
    (dom/div
      (dom/p {} (str "x: " my-x-val))
      (dom/p {} (str "y: " my-y-val))
      (ui-form {:error true}
        (ui-form-input {:value my-x-val :onChange on-x-change :label "X" :error true})
        (ui-form-input {:value my-y-val :onChange on-y-change :label "Y"})))))

(ws/defcard form-input-with-input-control
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       FormInput}))

