(ns wps.summarizer
 (:require [clj-http.client :as client]
           [net.cgrand.enlive-html :as html]))

(defn summarize
  "Summarize the html found at 'url'."
  [url]
  (let [resource (-> url
                     client/get
                     :body
                     java.io.StringReader.
                     html/html-resource
                     )]
    {:title
     (-> resource
         (html/select [:title])
         first
         html/text)
     :headings
     (map html/text
          (html/select resource [#{:h1 :h2 :h3 :h4 :h5 :h6}]))}))