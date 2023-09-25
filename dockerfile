# STAGE Build
FROM maven:3.8-openjdk-17 AS maquinabuild

COPY . .

RUN mvn clean package -DskipTests
# STAGE Packege

FROM openjdk:17-jdk-slim

COPY --from=maquinabuild /target/*.jar ismael.jar
EXPOSE 8080
ENTRYPOINT ["java", "jar", "fidalgo.jar"]