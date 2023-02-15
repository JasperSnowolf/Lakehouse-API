FROM openjdk:8
ADD target/Lakehouse-API.war Lakehouse-API.war
ENTRYPOINT ["java", "-war","Lakehouse-API.war"]
EXPOSE 8080