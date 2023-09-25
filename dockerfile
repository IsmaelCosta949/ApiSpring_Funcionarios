# STAGE Build
FROM maven:3.8-openjdk-17 AS maquinabuild

WORKDIR /app
COPY . .

RUN mvn clean package -DskipTests

# STAGE Package
FROM openjdk:17-jdk-slim

WORKDIR /app
COPY --from=maquinabuild /app/target/*.jar ismael.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ismael.jar"]
