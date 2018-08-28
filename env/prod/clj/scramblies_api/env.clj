(ns scramblies-api.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[scramblies-api started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[scramblies-api has shut down successfully]=-"))
   :middleware identity})
