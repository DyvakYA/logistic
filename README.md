![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)
[![Build status](https://travis-ci.com/DyvakYA/LogisticCompany.svg?branch=master)](https://travis-ci.org/DyvakYA/LogisticCompany) 
![Code Climate coverage](https://img.shields.io/codeclimate/coverage/DyvakYA/LogisticCompany.svg)
![Code Climate maintainability](https://img.shields.io/codeclimate/maintainability/DyvakYA/LogisticCompany.svg)
[![License MIT](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/DyvakYA/LogisticCompany/master/LICENSE.md)
![Completeness](https://img.shields.io/badge/completeness-10%25-lightgrey.svg)



# Logistic company

## Schema

 * [LogisticCompany](.)
   * [authentication-service](./authentication-service) (Spring Boot, MongoDB)
   * [main-service](./main-service) (Spring Boot, MongoDB)
   * [user-interface](./user-interface) (Angular CLI)

 This is a [proof-of-concept application](https://logisticcompany.com), which demonstrates [Microservice Architecture Pattern](http://martinfowler.com/microservices/) using Spring Boot, Spring Cloud and Docker.
 With a not pretty neat user interface, by the way.

## Introduction

Logistic company system. An order for the shipping of goods. 

Assigned : the transport (the transport must be insured), the type of cargo, 
the trailer for transportation (there may be several, depending on the transport), 
the driver (may be pilot), the route with stops and duration. 
Vehicles must move with an interval or a timetable defined for each Route. 
The driver must have a certificate (corresponding to the type of transport and the cargo being transported), 
insurance, and a medical certificate of health.

 ## Getting started
 
**What you’ll need**
 
 * A favorite text editor or IDE
 
 **Back-end**
 * JDK 1.8 or later
 * MongoDB
 * Spring Boot 1.5.1.RELEASE
 * Gradle 4+
 * Docker
 
 **Front-end**
 * Node.js
 * Angular CLI
 * Bootstrap
 * jQuery
 
 ![chrome-capture](https://user-images.githubusercontent.com/20241892/50727733-be8fc280-1127-11e9-8efd-96fa14ec0b51.gif)
 
  Method	| Path	| Description	| User authenticated | Available from UI
 --- | --- | --- |:---:|:---:|
 GET	| /login	| Login user	|   | ×
 GET	| /registration	| User registration	|   | ×
 
 ##### User API instruction
  Method	| Path	| Description	| User authenticated | Available from UI
 --- | --- | --- |:---:|:---:|
 GET	| /users	| Get all users data	| × | ×
 GET	| /users/{id}	| Get specified users data	| × | ×
 POST	| /users	| Create new user data	| × | 	×
 PUT	| /users{id}	| Update specified user data	| × | ×
 DELETE	| /users/{id[]}	| Delete specified users data	| × | ×
 
 ##### Order API instruction 
  Method	| Path	| Description	| User authenticated | Available from UI
  --- | --- | --- |:---:|:---:|
  GET	| /orders	| Get all orders data	| × | 
  GET	| /orders/{id}	| Get specified orders data	| × | 
  POST	| /orders	| Create new order data	| × | 	
  PUT	| /orders/{id}	| Update specified order data	| × | 
  DELETE	| /orders/{id[]}	| Delete specified order data	| × | 
 
 ## License
 
 This project is licensed under the terms of the MIT license. **Free Software, Hell Yeah!**




