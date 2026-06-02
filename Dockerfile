FROM eclipse-temurin:21-jdk

WORKDIR /app

RUN useradd -m appuser

ENV APP_NAME=spaceagro-monitor

COPY target/*.jar app.jar

USER appuser

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]