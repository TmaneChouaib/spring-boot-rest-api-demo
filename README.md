<h2 align="center">    <img width="50" src="https://user-images.githubusercontent.com/25181517/117201470-f6d56780-adec-11eb-8f7c-e70e376cfd07.png" alt="Spring" title="Spring"/>
spring-boot-rest-api-demo - demo
API    <img width="50" src="https://user-images.githubusercontent.com/25181517/117201470-f6d56780-adec-11eb-8f7c-e70e376cfd07.png" alt="Spring" title="Spring"/>
</h2>

## 🔎 Table of Contents:

- [About](#about)
- [Objective](#objective)
- [Features](#features)
- [Endpoints](#endpoints)
- [HTTP Status Codes](#http-status-codes)
- [Project Structure](#project-structure)
- [Used Technologies](#used-technologies)
- [Contacts](#contacts)

## <a name="about"></a> 📎 About:

- This repository provides a foundational Spring Boot application demonstrating the implementation of a RESTful API.

## <a name="objective"></a> 📎 Objective:

- The main objective of this repository is to provide a demonstration of building a RESTful API using Spring Boot.

## Features:

- **RESTful Endpoints**: Implementation of CRUD operations for managing ressources.
- **DTOs**: Data transfer objects for encapsulating data exchanged between the client and server.
- **Service Layer**: Business logic encapsulating in service classe.
- **Repository Layer**: Data access logic managed by JPA repositories.

## <a name="endpoints"></a> 📎 Endpoints:

### RESTful Endpoints naming convention:

- RESTful convention :

| Endpoint      | HTTP Method | Description                                    |
|---------------|-------------|------------------------------------------------|
| {entity}      | GET         | Retrieves the complete list of entities.       |
| {entity}      | POST        | Create a new entity.                           |
| {entity}/{id} | GET         | Retrieves the details of a specific entity.    |
| {entity}/{id} | PUT         | Updates the information of an existing entity. |
| {entity}/{id} | DELETE      | Delete an existing entity.                     | 

- After launching the application, you can access the Swagger
  documentation [here](<http://localhost:8080/swagger-ui/index.html>).
- Alternatively, you can simply refer to the table below, which displays the available endpoints.

**Personages API Endpoints**

| Endpoint        | HTTP Method | Description                                       |
|-----------------|-------------|---------------------------------------------------|
| personages      | GET         | Retrieves the complete list of personages.        |
| personages      | POST        | Create a new personage.                           |
| personages/{id} | GET         | Retrieves the details of a specific personage.    |
| personages/{id} | PUT         | Updates the information of an existing personage. |
| personages/{id} | DELETE      | Delete an existing personage                      |

## <a name="http-status-codes"></a> 📎 Http Status Codes:

- This section presents the most commonly encountered HTTP status codes when developing a REST API.HTTP status codes are
  crucial indicators of the request and response state between the client and the server.
  Here are the top ten HTTP status codes and their meanings in the context of RESTful web services.

#### Top 10 HTTP Status Codes

| Code | Description           | REST Service-Specific Information                                                         |
|------|-----------------------|-------------------------------------------------------------------------------------------|
| 200  | OK                    | The request has been successfully processed.                                              |
| 201  | Created               | The request has been successfully processed, and a new resource has been created.         |
| 204  | No Content            | The request has been successfully processed but does not return any content.              |
| 304  | Not Modified          | The resource has not been modified since the last request.                                |
| 400  | Bad Request           | The request is malformed or cannot be processed by the server.                            |
| 401  | Unauthorized          | Access to the resource requires authentication.                                           |
| 403  | Forbidden             | Access to the resource is forbidden for the current user.                                 |
| 404  | Not Found             | The requested resource was not found on the server.                                       |
| 409  | Conflict              | The request cannot be processed due to a conflict with the current state of the resource. |
| 500  | Internal Server Error | An internal server error occurred, preventing the request from being processed.           |

#### note:

- This table of HTTP status codes is essential for understanding the responses returned by REST API and for diagnosing
  potential issues during the development or integration of an application with the API.

## <a name="project-structure"></a> 📎 Project Structure:

```
spring-boot-rest-api-demo/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── tmane/
│   │   │           └── restappdemo/
│   │   │               ├── config/
│   │   │               │   └── WebConfig.java
│   │   │               ├── controller/
│   │   │               │   └── PersonnageController.java
│   │   │               ├── dto/
│   │   │               │   └── PersonnageDTO.java
│   │   │               ├── entity/
│   │   │               │   └── Personnage.java
│   │   │               ├── mapper/
│   │   │               │   └── PersonnageMapper.java
│   │   │               ├── repository/
│   │   │               │   └── PersonnageRepository.java
│   │   │               ├── service/
│   │   │               │   ├── Impl/
│   │   │               │   │   └── PersonnageServiceImpl.java
│   │   │               │   └── PersonnageService.java
│   │   │               └── RestAppDemoApplication.java
│   │   │
│   └── resources/
│       └── application.properties
│
├── pom.xml
└── README.md
```

## <a name="used-technologies"></a> 📎 Used technologies:

- Spring Boot
- Spring Data JPA
- Spring Data REST
- Swagger OpenAPI
- MySQL Database

## <a name="contacts"></a> 📎 Contacts:

- For any inquires or feedback regarding this project, please contact me on: chouaib.tmane@hotmail.com.

<p align="right" style="font-size: x-large; font-weight: bold"> End </p>

----------------------------------------------------------------------------------------------------------

<p align="center">
<img src="public-doc/Brand.png">
