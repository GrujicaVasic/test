FROM openjdk:23-jdk-oracle
WORKDIR /opt/nutriZonaBack
COPY target/*.jar nutriZona.jar
ARG DEFAULT_PORT=9000
ENV PORT=$DEFAULT_PORT
EXPOSE $PORT
ENTRYPOINT ["java", "-jar", "nutriZona.jar"]