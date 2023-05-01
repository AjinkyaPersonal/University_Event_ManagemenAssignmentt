<h1 align = "center"> University_Event_ManagemenAssignment </h1>

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

This project is a User Event Management System that allows CRUD operations on a User and Event Entity with added validation on the entity class. The project is built using Spring Boot and H2 Database.

---
<br>

## Framework Used
* Spring Boot

---
<br>

## Language Used
* Java

---
<br>

## Data Model

The Job data model is defined in the Job class, which has the following attributes:

* Student

```
studentId (Integer) : Unique identifier for Student.
firstName (String) : First Name of the Student.
lastName (String) : Last Name of the Student.
age (Integer) : Age of the Student.
department (String-Enum) : Type of department of Student(ME , ECE , CIVIL , CSE).
```

* Event

```
eventId (Integer): Unique identifier for the event.
eventName (String): Name of the Event.
locationOfEvent (String): Location of the Event.
location (String): location of the job.
date (LocalDate): Date of the Event.
startTime (String) : Start Time of the Event.
endTime (String) : End Time of the Event.
```

### Validation

To validate the input we get from client, we've used validation annotations that are used to enforce specific constraints on the values of the variables. These constraints ensure that the data input by the user is of the correct format and meets certain criteria.

* @Valid - In Spring Framework, the @Valid annotation is used in conjunction with @PostMapping and @PutMapping annotations, which are used to handle POST and PUT requests, respectively. When used with @PostMapping or @PutMapping, the @Valid annotation is typically applied to a method parameter annotated with @RequestBody.

* @NotEmpty: This annotation is used to validate that the annotated field is not null or empty. 

* @NotNull: This annotation is used to validate that the annotated field is not null.

* @Max : This annotation is used to validate that the annotated field is not greater than the mentioned value in field.

* @Min : This annotation is used to validate that the annotated field is not smaller than the mentioned value in field.
---
<br>

## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

<br>


## API End Points 

</br>

### Student
- We're extending JpaRepository into repository interface.

* PostMapping: "/students"
```
This endpoint makes a call to method in StudentService class where we implement method "saveAll()" which is in JPA Repository.
```

* GetMapping: "/students"
```
This endpoint makes a call to method in StudentService class which retrieves data of all students from database by implementing method "findAll()" present in JPA repository. This data is sent to controller which is then sent through the API to client.
```

* GetMapping: "/students?id=(userId)"
```
This endpoint makes a call to method in StudentService class which retrieves data of student by id from database by implementing method "findById()" present in JPA repository. This data is sent to controller which is then sent through the API to client.
```

* PutMapping : "/student/{id}/{department}"
```
This endpoint makes a call to method in StudentService class which is connected to database. In database we update a Student department based on id given through API , here we have used our Custom Query.
```

* DeleteMapping : "/student/{id}"
```
This endpoint makes a call to method in StudentService class which is connected to database. In database we delete a student by id given through API.
```


</br>

### Event
- We're extending JpaRepository into repository interface.

* PostMapping: "/events"
```
This endpoint makes a call to method in EventService class where we implement method "saveAll()" which is in JPA Repository.
```

* GetMapping: "/events"
```
This endpoint makes a call to method in EventService class which retrieves data of all events from database by implementing method "findAll()" present in JPA repository. This data is sent to controller which is then sent through the API to client.
```

* GetMapping: "/events?id=(userId)"
```
This endpoint makes a call to method in EventService class which retrieves data of Event by id from database by implementing method "findById()" present in JPA repository. This data is sent to controller which is then sent through the API to client.
```

* PutMapping : "events/{id}"
```
This endpoint makes a call to method in EventService class which is connected to database. In database we update a Event based on id given through API.
```

* DeleteMapping : "events/{id}"
```
This endpoint makes a call to method in EventService class which is connected to database. In database we delete a event by id given through API.
```

---
<br>


## DataBase Used
* H2 database
```
We have used InMemory database H2 to implement CRUD Operations.
```
---
<br>

## Project Summary

The project is a job search portal built using Spring Boot and H2 Database. It allows CRUD operations on a Student and Event entity with added validation using Spring Boot 
validation. The Student entity class has fields for student details like studentId , first name , last name , age , department and 
Event entity class has fields for event details like eventId , eventName , locationOfEvent , date , startTime , endTime . The project supports various endpoints for CRUD operations and searching for Student and Events based on id and date . 
Custom finders and custom queries are also available for advanced querying.

## Author

👤 **Ajinkya Padule**

* GitHub: [AjinkyaPersonal](https://github.com/AjinkyaPersonal)

* LinkedIn: [Ajinkya Padule](https://www.linkedin.com/in/ajinkya-padule-04b8541a6/)
    
---

## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page]("url").
    
---
    
## Show your support

Give a ⭐️ if this project helped you!
    
---
    
## 📝 License

Copyright © 2023 [Ajinkya Padule](https://github.com/AjinkyaPersonal).<br />

This project is [MIT]("url") licensed.
    
---
