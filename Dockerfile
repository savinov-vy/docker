FROM maven:3.8.4-jdk-11-slim as build-container

RUN mkdir -p /home/service

COPY . /home/service

WORKDIR /home/service

RUN mvn install


FROM openjdk:11.0.4-jre-slim

RUN mkdir -p /home/service

COPY --from=build-container /home/service/target/study_d-1.0.jar /home/service
