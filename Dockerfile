FROM java:8-jre
MAINTAINER Yurii Dyvak <dyvakyurii@gmail.com>

ADD ./target/logistic.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/logistic.jar"]

EXPOSE 8000