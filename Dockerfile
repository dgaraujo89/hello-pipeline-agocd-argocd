FROM openjdk:latest

WORKDIR /app

COPY target/*.jar app.jar

CMD java -jar app.jar

ENTRYPOINT ["/bin/bash"]