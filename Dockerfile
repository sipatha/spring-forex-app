FROM openjdk:8-jdk-alpine
MAINTAINER n002213f.github.com
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]