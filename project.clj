(defproject re-waypoints "0.1.0-SNAPSHOT"
  :description "A pure-Clojure re-implementation of Waypoints."
  :url "https://github.com/RadicalZephyr/re-waypoints"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/RadicalZephyr/re-waypoints.git" }

  :dependencies [[reagent "0.7.0"]
                 [org.clojure/clojurescript "1.9.908" :scope "test"]
                 [org.clojure/clojure "1.8.0"         :scope "test"]
                 [devcards "0.2.3"                    :scope "test"]
                 [garden "1.3.2"                      :scope "test"]
                 [cljsjs/react "15.3.1-0"]
                 [cljsjs/react-dom "15.3.1-1"]]
  :plugins [[lein-figwheel "0.5.13"]]

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
