#!/bin/sh
 cd main-service; ./gradlew clean build; cd ..
cd authentication-service; ./gradlew clean build; cd ..