(ns scramblies-api.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [scramblies-api.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[scramblies-api started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[scramblies-api has shut down successfully]=-"))
   :middleware wrap-dev})
