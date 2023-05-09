FROM openjdk:17-alpine

MAINTAINER dielu85

COPY /target/SpringBoot-0.0.1-SNAPSHOT.jar SpringBoot-0.0.1-SNAPSHOT.jar

WORKDIR /target

CMD ["java", "-jar", "/SpringBoot-0.0.1-SNAPSHOT.jar"]
