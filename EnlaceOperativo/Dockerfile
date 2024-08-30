# Build stage
FROM maven:3.8.5-openjdk-17-slim AS compile

ARG HOME_DIR="/enlace-operativo"
ARG ENVIRONMENT=develop
WORKDIR $HOME_DIR

# Copy the Project Object Model file
COPY ./pom.xml ./pom.xml

# Fetch all dependencies
RUN mvn dependency:go-offline -B

# Copy the source files
COPY ./src ./src

# Build for release
RUN mvn package -Dmaven.test.skip=true && cp target/*.jar shared-localization.jar

# Package stage
FROM openjdk:17-jdk-slim-buster AS jar

RUN addgroup --system spring && adduser --system spring --ingroup spring

ARG HOME_DIR="/nlace-operativo"
ARG ENVIRONMENT=develop

COPY --chown=spring --from=compile $HOME_DIR/*.jar ./

USER spring:spring