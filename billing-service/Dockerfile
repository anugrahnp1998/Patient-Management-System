# Stage 1: Build
FROM maven:3.9.9-eclipse-temurin-21 AS builder

WORKDIR /app

# Copy pom.xml and download dependencies
COPY pom.xml /app
RUN mvn dependency:go-offline -B

# Copy source code into correct folder
COPY src /app/src

# Build the project, skipping tests
RUN mvn clean package -DskipTests

# Stage 2: Run
FROM openjdk:21-jdk AS runner

WORKDIR /app

# Copy the built jar from builder stage
COPY --from=builder /app/target/billing-service-0.0.1-SNAPSHOT.jar app.jar

# Expose Spring Boot port
EXPOSE 4001
EXPOSE 9001

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
