FROM java:8-jre
MAINTAINER Yurii Dyvak <dyvakyurii@gmail.com>

ADD ./target/main-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/main-service.jar"]

EXPOSE 8000