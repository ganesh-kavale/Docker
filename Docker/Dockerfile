# Use an official OpenJDK runtime as a parent image
FROM openjdk:11

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Compile the Java program, including the package structure
RUN javac EasyMapUse.java

# Run the Java program, specifying the fully qualified class name
CMD ["java", "EasyMapUse"]
