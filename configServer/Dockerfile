FROM openjdk:11-slim as build
#FROM maven:3.6.0-jdk-11-slim AS build
MAINTAINER armanit.net

RUN apt-get update && apt-get install -y curl
#
#COPY src /app/src
#COPY pom.xml /app

#RUN mvn -f /app/pom.xml clean package

COPY target/configServer-0.0.1-SNAPSHOT.jar configServer-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/configServer-0.0.1-SNAPSHOT.jar"]