
# Spring Boot
## APIs

### _Set up your development environment_

- Install the latest version of Java
- Install an IDE (such as IntelliJ IDEA or Eclipse)
- Install Spring Boot
- Create a new Spring Boot project


### _Annotations_
1. @SpringBootApplication: This annotation is used to mark the main class of a Spring Boot application. It combines the functionality of three other annotations: @Configuration, @EnableAutoConfiguration, and @ComponentScan.

2. @RestController: This annotation is used to mark a class that handles incoming HTTP requests and produces responses in the form of JSON, XML, or other data formats.

3. @GetMapping: This annotation is used to map a method to an HTTP GET request. It is typically used to retrieve data from a server.

4. @PostMapping: This annotation is used to map a method to an HTTP POST request. It is typically used to submit data to a server.

5. @PutMapping: This annotation is used to map a method to an HTTP PUT request. It is typically used to update an existing resource on the server.

6. @DeleteMapping: This annotation is used to map a method to an HTTP DELETE request. It is typically used to delete an existing resource on the server.

7. @PathVariable: This annotation is used to bind a URI template variable to a method parameter.

8. @RequestBody: This annotation is used to indicate that a method parameter should be bound to the body of an incoming HTTP request.

9. @ResponseStatus: This annotation is used to specify the HTTP status code to be returned by a method.

10. @ExceptionHandler: This annotation is used to define an exception handler method for a controller. It is typically used to handle exceptions thrown by the controller methods.

### _Spring Boot File Structure_
> root (Project Root Folder)
>> src
>>> main
>>>> java
>>>>> controllers
>>>>> services
>>>>> repositories
>>> resources
>>>>> properties.yml
>>> test
>>>> java
>>>> resources
>> pom


### _APIs Best Practice_

1. _Use RESTful principles:_ REST (Representational State Transfer) is a widely-used architectural style for building web APIs. RESTful APIs are designed to be simple, lightweight, and scalable. When building APIs in Java, it is recommended to follow RESTful principles, such as using HTTP methods (GET, POST, PUT, DELETE) for CRUD operations and using resource URIs to identify resources.

2. _Use DTOs (Data Transfer Objects):_ DTOs are objects that are used to transfer data between the client and the server. Using DTOs can help to decouple the API from the underlying data model and provide a more flexible and robust API.

3. _Use exception handling:_ When building APIs, it is important to handle exceptions properly to provide clear and informative error messages to the client. Java provides a powerful exception handling mechanism that can be used to catch and handle exceptions at different levels of the application.

4. _Use proper HTTP status codes:_ HTTP status codes are used to indicate the status of a request. Using the proper HTTP status codes can help the client to understand the outcome of a request and respond accordingly. 

    4.1. 200 OK
    4.2. 204 No Content.
    4.3. 400 Bad Request.
    4.4. 401 Unauthorized.
    4.5. 403 Forbidden.
    4.6. 404 Not Found.
    4.7. 405 Method Not Allowed.
    4.8. 500 Internal Server Error.
    4.9. 503 Service Unavailable.

5. _Use versioning:_ As APIs evolve over time, it is important to maintain backward compatibility and provide versioning for APIs. Versioning allows clients to continue to use older versions of the API while also allowing for new features and improvements to be added.

6. _Use caching:_ Caching can help to improve the performance of APIs by reducing the number of requests that need to be made to the server. Java provides several caching frameworks, such as Ehcache and Hazelcast, that can be used to implement caching in APIs.

7. _Use proper security:_ Security is a critical aspect of building APIs. Java provides several security frameworks, such as Spring Security and Apache Shiro, that can be used to implement authentication and authorization in APIs. It is also important to use proper encryption and hashing techniques to secure sensitive data.