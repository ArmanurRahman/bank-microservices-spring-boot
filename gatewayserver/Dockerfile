FROM openjdk:11-slim as build
#FROM maven:3.6.0-jdk-11-slim AS build
MAINTAINER armanit.net
#
#COPY src /app/src
#COPY pom.xml /app

#RUN mvn -f /app/pom.xml clean package

COPY target/gatewayserver-0.0.1-SNAPSHOT.jar gatewayserver-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/gatewayserver-0.0.1-SNAPSHOT.jar"]