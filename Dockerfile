FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=../target
COPY ./ /app
WORKDIR /app
COPY target/*.jar ./app.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]