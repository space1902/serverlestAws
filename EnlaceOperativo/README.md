# Enlace Operativo

This is a Spring Boot based project to host the modules to be deployed in lambda applications.
The modules will provide RESTful API for necessary operations such as authentication and document
upload tasks.

## Table of Contents

- [Requirements](#requirements)
- [Setup](#setup)
- [Usage](#usage)
- [Docker](#docker)
- [DataBase](#database)
- [Testing](#testing)
- [Coverage](#coverage)
- [API Documentation](#api-documentation)

## Requirements

- JDK 17
- Maven 3.8.4
- PostgresSQL 42.7.4

## Setup

1. Clone the repository:

```bash
git clone https://enlaceoperativo
```

2. Navigate to the project folder:

```bash
cd lambda-enlaceoperativo
```

3. Install the project dependencies:

```bash
mvn install
```

4. Set up your PostgresSQL instance, and configure the `application.properties` file accordingly.

5. Run the application:

```bash
mvn spring-boot:run
```

## Usage

To interact with the RESTful API, send HTTP requests to the appropriate endpoints. You can use tools
like [Postman](https://www.postman.com/) or [curl](https://curl.se/) for testing.

## Docker

You can also build and run the project using Docker. The provided `Dockerfile` contains instructions to create a Docker
image and container for the application.

1. Build the Docker image:

```bash
docker build -t enlace-operativo:latest .
```

2. Run the Docker container:

```bash
docker run -p 8080:8080 enlace-operativo:latest
```

## Database

You can set up a PostgreSQL database using Docker. Below, I provide you with the steps to create 
a container with PostgreSQL.

1. Create a Docker image with PostgreSQL:

```bash
docker pull postgres:latest
```

2. Run the PostgreSQL container:

```bash
docker docker run --name enlace-operativo-db -e POSTGRES_USER=myuser -e POSTGRES_PASSWORD=mypassword -e POSTGRES_DB=mydatabase -p 5432:5432 -d postgres:latest
```

3. Access the PostgreSQL container:

```bash
docker exec -it enlace-operativo-db psql -U myuser -d mydatabase
```

4. Set environment variables in your Spring Boot application (in application.properties or application.yml):

```
spring.datasource.url=jdbc:postgresql://localhost:5432/mydatabase
spring.datasource.username=myuser
spring.datasource.password=mypassword
spring.datasource.driver-class-name=org.postgresql.Driver
```

## Testing

To run the test suite, execute the following command:

```bash
mvn test
```

## Coverage

To run the coverage suite, execute the following command:

```bash
mvn clean
mvn test
mvn verify
```

## API Documentation

The project includes Swagger for API documentation. Once the application is running, you can access the Swagger UI at:

```
http://localhost:8080/swagger-ui.html
```

This will provide you with a detailed view of the available API endpoints, along with descriptions and example
request/response structures.