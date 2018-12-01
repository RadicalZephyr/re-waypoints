(defproject re-waypoints "0.1.0-SNAPSHOT"
  :description "A pure-Clojure re-implementation of Waypoints."
  :url "https://github.com/RadicalZephyr/re-waypoints"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/RadicalZephyr/re-waypoints.git" }

  :dependencies [[reagent "0.8.1"                      :scope "test"]
                 [org.clojure/clojurescript "1.10.238" :scope "test"]
                 [devcards "0.2.6"                     :scope "test"]
                 [garden "1.3.2"                       :scope "test"]]

  :plugins [[lein-figwheel "0.5.17"]]

  :clean-targets [:target-path "out"]

  :cljsbuild {:builds [{:id "devcards"
                        :figwheel {:devcards true}
                        :source-paths ["src" "test"]
                        :compiler {:main "re-waypoints.core-test"
                                   :asset-path "js/devcards_out"
                                   :output-to  "resources/public/js/re_waypoints_devcards.js"
                                   :output-dir "resources/public/js/devcards_out"
                                   :source-map true
                                   :source-map-timestamp true}}]})
