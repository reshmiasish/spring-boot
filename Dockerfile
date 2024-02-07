FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/spring-boot-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} reshmi-sample-spring-app.jar
ENTRYPOINT ["java","-jar","/reshmi-sample-spring-app.jar"]