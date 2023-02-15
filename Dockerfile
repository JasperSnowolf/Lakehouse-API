FROM openjdk:8
ADD target/Lakehouse-API.jar Lakehouse-API.jar
ENTRYPOINT ["java", "-jar", "Lakehouse-API.jar"]
EXPOSE 8080