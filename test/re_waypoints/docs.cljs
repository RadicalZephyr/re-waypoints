(ns re-waypoints.docs
  (:require [reagent.core :as reagent]
            [cljsjs.marked]
            [raven.notify :as raven]))

(defn markdown [content]
  [:div
   {:dangerouslySetInnerHTML
    {:__html (-> content str js/marked)}}])

(defn section [title & contents]
  (into [:div [:h1 title]] contents))

(defn main-panel []
  [:div
   [section "Getting Started"
    [markdown "Try this out."]]
   [raven/notifications]])

(defn ^:export start! []
  (reagent/render [main-panel]
                  (.getElementById js/document "app")))
