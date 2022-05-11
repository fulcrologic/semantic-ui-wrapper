(ns com.fulcrologic.semantic-ui.views.statistic.ui-statistic-label
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react$StatisticLabel" :as StatisticLabel]))

  (def ui-statistic-label
  "A statistic can contain a label to help provide context for the presented value.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply StatisticLabel)))
