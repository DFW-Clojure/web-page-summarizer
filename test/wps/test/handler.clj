(ns wps.test.handler
  (:use clojure.test
        ring.mock.request
        wps.handler))

(deftest test-app
  (testing "main route"
    (let [response (app (request :get "/"))]
      (is (= (:status response) 200)))
    (let [response (app (request :post "/" {:url "http://www.example.org"}))]
      (is (= (:status response) 200))))

  (testing "not-found route"
    (let [response (app (request :get "/invalid"))]
      (is (= (:status response) 404)))))