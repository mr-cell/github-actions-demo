FROM adoptopenjdk:11-jre-hotspot
WORKDIR /app
COPY build/libs/github-actions-demo-*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]