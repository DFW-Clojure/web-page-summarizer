(defproject wps "0.1.0-SNAPSHOT"
  :description "Compojure app that summarizes websites."
  :url "https://github.com/DFW-Clojure/web-page-summarizer"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [clj-http "0.1.3"]
                 [compojure "1.1.4"]
                 [enlive "1.0.1"]]
  :plugins [[lein-ring "0.8.0"]]
  :ring {:handler wps.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.3"]]}})
