FROM frolvlad/alpine-oraclejdk8:slim
ENV MONGO_URL mongodb://localhost/dyvak
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/belfastjug-sample-01-0.0.1-SNAPSHOT.jar /app/belfastjug-sample-01.jar
ENTRYPOINT ["java", "-jar", "/app/belfastjug-sample-01.jar"]