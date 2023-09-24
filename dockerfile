# Use a imagem base do OpenJDK
FROM openjdk:11-jre-slim

# Copie o arquivo JAR da sua aplicação para a imagem
COPY target/sua-aplicacao.jar /app.jar

# Exponha a porta que a aplicação Spring Boot está ouvindo
EXPOSE 8080

# Comando para iniciar a aplicação Spring Boot quando o contêiner for iniciado
CMD ["java", "-jar", "/app.jar"]