(ns wps.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [wps.controller :as c]))

(defroutes app-routes
  (GET "/" [] (c/home-page))
  (POST "/" [url] (c/summary-page url))
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
