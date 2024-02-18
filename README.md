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
6. multiple paths to single controller method
7. Using thymeleaf to usage templates for displaying dynamic content for the home page
8. disabling thymeleaf cache using spring properties
9. enabled dev tools for auto start and live reload
10. Added all the home.html html, css and js code
11. Added all thymeleaf templates required
12. Implemented WebMvcConfigurer class for static views
13. Added static view for the about page
14. Added controller for the contact page and accepting the data from the form in the contact page using @Requestparam
15. Changed controller method for contact page form to accept pojo instead of requestparams
16. Added Holidays controller to fetch holidays from backend using thymeleaf th:each and th:item
17. Made changes to use Lombok for pojos
18. Used slf4j for logging
19. Added request params for displaying holidays to filter holidays based on request params
20. Changed the holidays filter from request params to path variables, by default display all holidays, if filter is used display holidays related to the filter
21. Added server side field validations using jakarta validations
22. Working with request scope by changing the contact service to RequestScope
23. Working with session scope by changing the contact service to SessionScope
24. Working with application scope by changing the contact service to ApplicationScope

