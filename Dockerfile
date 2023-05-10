FROM openjdk:11-jre-slim

WORKDIR /app

#COPY target/application.logs.2023-05-07.0.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
