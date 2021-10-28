FROM openjdk:latest

WORKDIR app

COPY artifacts/*.jar app.jar

RUN java -jar app.jar

ENTRYPOINT ["/bin/bash"]