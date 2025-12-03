(ns fulcrologic.semantic-ui.workspaces.button
  (:require [com.fulcrologic.fulcro.components :as comp]
            [com.fulcrologic.fulcro.dom :as dom]
            [com.fulcrologic.semantic-ui.elements.button.ui-button-group :refer [ui-button-group]]
            [com.fulcrologic.semantic-ui.elements.icon.ui-icon :refer [ui-icon]]
            [com.fulcrologic.semantic-ui.factories :refer [ui-button]]
            [com.fulcrologic.semantic-ui.icons :as i]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.core :as ws]))

(comp/defsc SomeButtons
  [this {:keys [x]}]
  {:initial-state (fn [_] {:x "x"})
   :ident         (fn [] [::id "singleton"])
   :query         [:x]}

  (dom/div {}
    (ui-button-group nil
      (ui-button nil "A")
      (ui-button nil "B")
      (ui-button nil "C"))
    (dom/br)
    (ui-button {} "A")
    (dom/br)
    (ui-button {:content       "Like"
                :icon          i/heart-icon
                :label         {:as "a" :basic true :content "2,000"}
                :labelPosition "left"})
    (dom/br)
    (ui-button-group nil
      (ui-button {:icon true}
        (ui-icon {:name i/align-left-icon}))
      (ui-button {:icon true}
        (ui-icon {:name i/align-center-icon}))
      (ui-button {:icon true}
        (ui-icon {:name i/align-right-icon}))
      (ui-button {:icon true}
        (ui-icon {:name i/align-justify-icon}))
      )
    (ui-button {} "C")
    (dom/br)
    (ui-button {} "D")))

(ws/defcard some-buttons
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       SomeButtons}))

