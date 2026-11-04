FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copy and compile your code
COPY src /app/src
RUN javac -d /app/classes $(find /app/src -name "*.java")

# Run the main class (adjust the class name)
CMD ["java", "-cp", "/app/classes", "Main"]