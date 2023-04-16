FROM openjdk:8-alpine
MAINTAINER passkit
RUN mkdir -p /opt/app


COPY target/*.jar /opt/app/app.jar
CMD ["java", "-jar", "app.jar"]