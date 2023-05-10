FROM openjdk:17-alpine

MAINTAINER dielu85

COPY /target/Portfolio-Backend-0.0.1-SNAPSHOT.jar Portfolio-Backend-0.0.1-SNAPSHOT.jar

WORKDIR /target

CMD ["java", "-jar", "/Portfolio-Backend-0.0.1-SNAPSHOT.jar"]
