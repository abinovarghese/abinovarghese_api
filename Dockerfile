FROM maven:3.5.4-jdk-8-alpine as maven
COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/
RUN mvn package

FROM openjdk:8-jre-alpine

WORKDIR /app

COPY --from=maven /build/target/abinovarghese-server-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-jar", "abinovarghese-server-0.0.1-SNAPSHOT.jar"]