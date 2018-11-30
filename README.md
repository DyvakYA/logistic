![contributions welcome](https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat)
[![Build status](https://travis-ci.com/DyvakYA/LogisticCompany.svg?branch=master)](https://travis-ci.org/DyvakYA/LogisticCompany) 
![Code Climate coverage](https://img.shields.io/codeclimate/coverage/DyvakYA/LogisticCompany.svg)
![Code Climate maintainability](https://img.shields.io/codeclimate/maintainability/DyvakYA/LogisticCompany.svg)
[![License MIT](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/DyvakYA/LogisticCompany/master/LICENSE.md)



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
 **A simple way to get access to the application is enter login and password**
 
 ![login](https://user-images.githubusercontent.com/20241892/49181517-41bb3d00-f360-11e8-87d0-0179460cf403.gif)
 
 
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
 
  ## Warning
 
 Complexity and patterns should only be introduced when they are needed for practical
 extensibility.
 
 The number of bugs may increase and the code will cease to be supported.
  
 The owner of this repository is not responsible for any consequences.
 
 ## License
 
 This project is licensed under the terms of the MIT license.




