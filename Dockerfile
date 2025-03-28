FROM openjdk:23-jdk
COPY target/*.jar nutriZona.jar
ENTRYPOINT ["java", "-jar", "/nutriZona.jar"]