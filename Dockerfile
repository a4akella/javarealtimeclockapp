FROM openjdk:11-jre-slim

LABEL "AUTHOR"="RAMANA KUMAR AKELLA"

WORKDIR /app

COPY /var/lib/jenkins/workspace/realtime-clock-app/target/real-time-app-1.0.0.jar .

ENTRYPOINT ["java", "-jar","real-time-app-1.0.0.jar"]

EXPOSE 8090
