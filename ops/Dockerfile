FROM openjdk:latest

WORKDIR app

COPY artifacts/*.jar app.jar

CMD java -jar app.jar

ENTRYPOINT ["/bin/bash"]