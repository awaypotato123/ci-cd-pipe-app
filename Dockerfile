FROM openjdk:21
WORKDIR /app
COPY target/spring-devops.jar app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

