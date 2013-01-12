(ns wps.templates
  (:require [net.cgrand.enlive-html :as html]))

(html/defsnippet homepage-content "templates/base.html"
  [:div.home-page-content :> :*]
  [initial-value]
  [[:input (html/attr= :type "text")]] (html/set-attr "value" initial-value))

(html/deftemplate base "templates/base.html"
  [title content]
  [:title] (html/content title)
  [:body [:h1 html/first-child]] (html/content title)
  [:div.content] (html/content content))

(defn home-page
  "Render the home page."
  [initial-value]
  (base "Web Page Summarizer"
        (homepage-content initial-value)))
