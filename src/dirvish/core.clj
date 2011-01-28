(ns dirvish.core
  (:use lamina.core aleph.http))

(defn hello-world [channel request]
  (enqueue channel
     {:status 200
      :headers {"Content-Type" "text/html"}
      :body "Hello Clojure!"}))

(start-http-server hello-world {:port 8080})
