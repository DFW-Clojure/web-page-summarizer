(ns wps.controller
  (:require [wps.templates :as t]))

(defn home-page
  "Display the home page with the request form."
  [request]
  (t/base "Web Page Summarizer" "<p>INPUT HERE</p>"))