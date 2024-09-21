FROM openjdk:23-jdk-slim

WORKDIR /app
COPY target/weather-api-0.0.1-SNAPSHOT.jar weather-api.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "weather-api.jar"]
