FROM adoptopenjdk/openjdk17:alpine-jre

MAINTAINER dielu85

COPY /target/SpringBoot-0.0.1-SNAPSHOT.jar SpringBoot-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/SpringBoot-0.0.1-SNAPSHOT.jar"]
