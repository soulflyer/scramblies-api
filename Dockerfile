FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/scramblies-api.jar /scramblies-api/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/scramblies-api/app.jar"]
