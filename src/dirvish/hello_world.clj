(ns dirvish.hellow_world
  (:use aleph))

(defn hello-world [request]
  (respond! request
            {:status 200
             :headers {"Content-Type" "text/html"}
             :body "Hello Clojure!"}))

(run-aleph hello-world {:port 8080})
