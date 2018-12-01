(ns re-waypoints.docs
  (:require [reagent.core :as reagent]
            [cljsjs.marked]
            [raven.notify :as raven]))

(defonce state (reagent/atom {::tab ::getting-started}))

(defn markdown [content]
  [:div
   {:dangerouslySetInnerHTML
    {:__html (-> content str js/marked)}}])

(defn section [title & contents]
  (into [:div [:h1 title]] contents))

(defmulti render-tab identity)

(defmethod render-tab :default [page-key]
  [:br])

(defmethod render-tab ::getting-started [_]
  [:div
   [section "Getting Started"
    [markdown "Try this out."]]
   [raven/notifications]])

(defn main-panel []
  (render-tab (::tab @state)))

(defn ^:export start! []
  (reagent/render [main-panel]
                  (.getElementById js/document "app")))
