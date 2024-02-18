# SpringBeans

This project works on creating a school web application using spring boot. This project has step by step incremental
changes in the spring boot application, which enables learning.
You can look at the commit history section of the readme file to understand the incremental changes made to this project

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Commit History](#commit-history)

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 17 or later
- [Spring](https://spring.io/projects/spring-boot) framework
- Maven for building the project

## Getting Started

Follow these steps to set up and run the Spring security Learner Microservice:

1. Clone this repository:

   ```shell
   git clone https://github.com/yr5913/school-web-app.git
   cd school-web-app
2. Build the microservice:
   ```shell
   mvn clean install

3. Run the microservice:
   ```shell
   java -jar target/school-web-app.jar

## Commit History

1. Start Web application which displays home.html to user with the path /home
2. Changed the port number and servlet context path
3. Started the web application at random port by setting the server.port value to 0
4. Turned debug on for the condition evaluation report
5. excluding DataSourceAutoConfiguration.class to test

