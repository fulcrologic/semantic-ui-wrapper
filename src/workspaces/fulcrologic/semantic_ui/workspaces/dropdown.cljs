(ns fulcrologic.semantic-ui.workspaces.dropdown
  (:require [com.fulcrologic.fulcro.components :as fp]
            [com.fulcrologic.fulcro.dom :as dom]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.lib.fulcro-portal :as f.portal]
            [com.fulcrologic.semantic-ui.modules.dropdown.ui-dropdown :refer [ui-dropdown]]
            [com.fulcrologic.semantic-ui.modules.dropdown.ui-dropdown-menu :refer [ui-dropdown-menu]]
            [com.fulcrologic.semantic-ui.modules.dropdown.ui-dropdown-item :refer [ui-dropdown-item]]
            [com.fulcrologic.semantic-ui.modules.dropdown.ui-dropdown-divider :refer [ui-dropdown-divider]]
            [com.fulcrologic.semantic-ui.elements.icon.ui-icon :refer [ui-icon]]
            [com.fulcrologic.semantic-ui.icons :as i]))

(fp/defsc Dropdown
  [this {:keys [x]}]
  {:initial-state {:x "x"}
   :ident         (fn [] [::id "singleton"])
   :query         [:x]}

  (dom/div {}
    (ui-dropdown {:text "File"}
      (ui-dropdown-menu {}
        (ui-dropdown-item {:text "New"})
        (ui-dropdown-item {:text "Open..." :description "ctrl + o"})
        (ui-dropdown-item {:text "Save as..." :description "ctrl + s"})
        (ui-dropdown-item {:text "Rename" :description "ctrl + r"})
        (ui-dropdown-item {:text "Make a copy"})
        (ui-dropdown-item {:icon i/folder-icon :text "Move to folder"})
        (ui-dropdown-item {:icon i/trash-icon :text "Move to trash"})
        (ui-dropdown-divider {})
        (ui-dropdown-item {:text "Download As..."})
        (ui-dropdown-item {:text "Publish To Web"})
        (ui-dropdown-item {:text "E-mail Collaborators"})))))

(ws/defcard dropdown
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? false
     ::ct.fulcro/root       Dropdown}))
