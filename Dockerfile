Docker Build Maven Stage
FROM maven:3-eclipse-temurin-17 AS build
# Copy folder in docker
WORKDIR /opt/app
COPY ./ /opt/app
RUN mvn clean install -DskipTests
# Run spring boot in Docker
FROM eclipse-temurin:17
COPY --from=build /opt/app/target/*.jar app.jar
ENV PORT 8081
EXPOSE $PORT
ENTRYPOINT ["java","-jar","-Xmx1024M","-Dserver.port=${PORT}","app.jar"]
