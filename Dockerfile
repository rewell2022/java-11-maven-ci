FROM adoptopenjdk/openjdk11:jdk-11.0.1.13-alpine
COPY target/devops-0.0.1-SNAPSHOT.jar app.jar 
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "./app.jar"]