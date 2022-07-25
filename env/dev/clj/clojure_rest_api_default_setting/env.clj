(ns clojure-rest-api-default-setting.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [clojure-rest-api-default-setting.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[clojure_rest_api_default_setting started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojure_rest_api_default_setting has shut down successfully]=-"))
   :middleware wrap-dev})
