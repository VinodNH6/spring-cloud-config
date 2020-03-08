# spring-cloud-config

Bootstrap.properties is used to fetch the config from Spring Cloud Server.

For Example, in My Bootstrap.properties file I have the following Config

spring.application.name=Calculation-service
spring.cloud.config.uri=http://localhost:8888

On starting the application , It tries to fetch the configuration for the service by connecting to http://localhost:8888 and looks at Calculation-service.properties present in Spring Cloud Config server

You can validate the same from logs of Calcuation-Service when you start it up

INFO 10988 --- [  restartedMain] c.c.c.ConfigServicePropertySourceLocator : Fetching config from server at : http://localhost:8888

