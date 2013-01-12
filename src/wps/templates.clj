(ns wps.templates
  (:require [net.cgrand.enlive-html :as html]))

(html/deftemplate base "templates/base.html"
  [title content]
  [:title] (html/content title)
  [:body [:h1 html/first-child]] (html/content title)
  [:body] (html/append content))