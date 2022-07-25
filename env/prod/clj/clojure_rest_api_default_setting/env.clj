(ns clojure-rest-api-default-setting.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[clojure_rest_api_default_setting started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojure_rest_api_default_setting has shut down successfully]=-"))
   :middleware identity})
