FROM eclipse-temurin:17-jdk-focal
WORKDIR /app
# Copy the Spring Boot application JAR file into the container
COPY target/spring-boot-0.0.1-SNAPSHOT.jar /app/my-spring-boot-app.jar

# Expose the port that the Spring Boot application will listen on
EXPOSE 8080

# Specify the command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "my-spring-boot-app.jar"]