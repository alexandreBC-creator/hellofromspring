FROM ubuntu/jdk:17-24.04_stable
ARG JAR_FILE
COPY target/hello-from-spring-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
