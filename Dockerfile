FROM openjdk:17-jdk-slim
WORKDIR /app
COPY .mvn/ .mvn
#RUN mvn -B -f ./pom.xml -s settings.xml dependency:resolve
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve
COPY src ./src
CMD ["./mvnw", "spring-boot:run"]