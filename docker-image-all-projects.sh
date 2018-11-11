#!/bin/sh

cd main-service; ./gradlew clean build distDocker; cd ..
cd authentication-service; ./gradlew clean build distDocker; cd ..

