FROM openjdk:8-alpine

COPY target/uberjar/clojure_rest_api_default_setting.jar /clojure_rest_api_default_setting/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/clojure_rest_api_default_setting/app.jar"]
