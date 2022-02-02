FROM maven:3.8.4-jdk-11-slim

RUN mkdir -p /home/service

COPY . /home/service

WORKDIR /home/service

RUN mvn install


