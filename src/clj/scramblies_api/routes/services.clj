(ns scramblies-api.routes.services
  (:require [ring.util.http-response :refer :all]
            [compojure.api.sweet :refer :all]
            [schema.core :as s]))

(defapi service-routes
  {:swagger {:ui "/swagger-ui"
             :spec "/swagger.json"
             :data {:info {:version "1.0.0"
                           :title "Scramblies"
                           :description "Search for a scrambled string contained in another string"}}}}

  (context "/api" []
    :tags ["scramblies"]

    (GET "/scramblies/:str1/:str2" []
      :return Boolean
      :path-params [str1 :- String, str2 :- String]
      :summary "searches for str2 in str1"
      (ok (= str1 str2)))))
