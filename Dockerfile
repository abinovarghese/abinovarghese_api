FROM openjdk:8-jdk-alpine

COPY target/abinovarghese-server-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch abinovarghese-server-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","abinovarghese-server-0.0.1-SNAPSHOT.jar"]