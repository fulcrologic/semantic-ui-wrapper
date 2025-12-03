(ns fulcrologic.semantic-ui.workspaces-main
  (:require [fulcrologic.semantic-ui.workspaces.button]
            [fulcrologic.semantic-ui.workspaces.dropdown]
            [fulcrologic.semantic-ui.workspaces.form]
            [fulcrologic.semantic-ui.workspaces.icon]
            [fulcrologic.semantic-ui.workspaces.input]
            [nubank.workspaces.core :as ws]))

(defonce init (ws/mount))

