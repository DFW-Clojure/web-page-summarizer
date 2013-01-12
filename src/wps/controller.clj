(ns wps.controller
  (:require [wps.templates :as t])
  (:use [wps.summarizer :only (summarize)]))

(defn home-page
  "Display the home page with the request form."
  []
  (t/home-page "http://clojure.org/"))

(defn summary-page
  "Display the summary page, with the summarized webpage."
  [url]
  (let [{:keys [title headings]} (summarize url)]
    (t/summary-page url title headings)))