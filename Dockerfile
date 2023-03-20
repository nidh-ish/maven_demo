FROM openjdk:11
COPY ./target/calculatorproject-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "calculatorproject-1.0-SNAPSHOT.jar"]
