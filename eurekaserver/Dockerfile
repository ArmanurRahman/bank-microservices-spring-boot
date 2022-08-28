FROM openjdk:11-slim as build
MAINTAINER armanit.net
RUN apt-get update && apt-get install -y curl

COPY target/eurekaserver-0.0.1-SNAPSHOT.jar eurekaserver-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/eurekaserver-0.0.1-SNAPSHOT.jar"]