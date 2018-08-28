(ns user
  (:require [scramblies-api.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [scramblies-api.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'scramblies-api.core/repl-server))

(defn stop []
  (mount/stop-except #'scramblies-api.core/repl-server))

(defn restart []
  (stop)
  (start))


