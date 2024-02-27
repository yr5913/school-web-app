# SpringBeans

This project works on creating a school web application using spring boot. This project works with spring beans, spring
mvc, spring security, lombok, request validations
This project has step by step incremental changes in the spring boot application, which enables learning.
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
20. Changed the holidays filter from request params to path variables, by default display all holidays, if filter is
    used display holidays related to the filter
21. Added server side field validations using jakarta validations
22. Working with request scope by changing the contact service to RequestScope
23. Working with session scope by changing the contact service to SessionScope
24. Working with application scope by changing the contact service to ApplicationScope
25. Implemented default spring security by adding dependency
26. Changed default spring credentials using application.properties
27. created custom security filter chain and permitting all web pages using permitAll
28. deny all requests using denyAll
29. modified security configuration for each url
30. Testing default CSRF security behaviour by spring
31. Disable CSRF
32. Implemented in memory authentication using InMemoryUserDetailsManager
33. Changed spring security logic to handle custom login configurations
34. Added login and logout, dashboard pages with thymeleaf support
35. Handling Global Exception using @ControllerAdvice and @ExceptionHandler
36. Added CSRF configuration to prevent CSRF attack
37. configured in memory h2 database
38. added saveContact and display contacts
39. implemented closing message functionality for admin
40. implemented aop for logging exceptions and time taken for each method
41. Displaying holidays from H2 Database
42. Changed everything from h2 database to mysql
43. add spring jpa dependency and migrated code from spring jdbc to spring data jpa
44. used spring data jpa audit feature for auditing the entries in database tables
45. Added changes for registering user and used custom validations to validate fields in registration
46. added one to one relationship and changed code to register user into database
47. configured sign in using the credentials in the database using spring security
48. using password encoder for encoding passwords and storing them as hash values in database
49. modified data.sql to have hashed password for admin
50. disabled the javax validations in spring data jpa
51. added profile link for any logged in user
52. Added Profile web page and profile model for profile page
53. Displayed user profile details using http session and setting authentication username to the email
54. made changes to provide user a feature to update his profile
55. added links and security config for admin
56. added class schema and defined one to many relationship between class and person
57. added backend code to display classes for admin and option to add and delete classes
58. added feature for admin to view, add and delete students from classes
59. Added courses schema and many to many relationship between person and courses and gave admin options to add new
    course
60. added an admin feature to add students to the courses
61. Added delete feature for deleting students from courses by admin
62. Made changes to student dashboard to display his class name
63. Added courses page for students
64. Displaying courses ordered by name in ascending order
65. Displaying courses ordered by name in descending order
66. Used Dynamic sorting to display courses ordered by name in descending order
67. Implemented pagination using pageable interface to display messages
68. Usage of @Query for custom queries in JPA, used both JPQL Query and Native Query
69. Using @Query, @Modifying and @Transactional in JPA to update data
70. Using @NamedQuery
71. using @NamedNativeQuery, spring doesn't support dynamic sorting if we use Named native query
72. Added REST endpoints for getting contact messages using spring mvc style with the help of @ResponseBody annotation
73. Get contact messages using spring mvc style rest endpoint, this time with request body using @RequestBody instead of request params
74. Using @RestController for the rest endpoints instead of using spring mvc style
75. Using @RequestHeader to get header value and also using ResponseEntity to populate response status, header and body in the response
76. Fixed CSRF issue for Post Requests and fixed authentication methods
77. Using @DeleteMapping to delete contact message and using RequestEntity object to get request details
78. Used @PatchMapping to patch the contact message to change the status from open to close
79. Added GlobalExceptionHandler to handle the errors in the RestController and specified order(1) to indicate priority as we have two exception handler
80. Allowing cross origin from everyone
81. Added support to also send response in xml format using MediaType in produces