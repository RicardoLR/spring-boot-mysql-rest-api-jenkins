# Spring Boot, MySQL, JPA, Hibernate Rest API Tutorial

API REST for use Jenkins

**1. Create Mysql database**

create database notes_app

**2. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**3. Build and run the app using maven**

Package: mvn clean && mvn package
Run: mvn spring-boot:run


## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/notes
    
    POST /api/notes
    
    GET /api/notes/{noteId}
    
    PUT /api/notes/{noteId}
    
    DELETE /api/notes/{noteId}

## Endpoints

http://localhost:8001/api/notes