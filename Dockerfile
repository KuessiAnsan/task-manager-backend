FROM openjdk:17

WORKDIR /app

COPY target/task-manager-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

ENV SPRING_PROFILES_ACTIVE=default

CMD ["java", "-jar", "task-manager-0.0.1-SNAPSHOT.jar"]
