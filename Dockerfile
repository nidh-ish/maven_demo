FROM openjdk:11
COPY ./target/mvndemoproject-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "mvndemoproject-1.0-SNAPSHOT.jar"]
