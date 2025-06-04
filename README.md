# EmpDetailsAzure

A simple CRUD (Create, Read, Update, Delete) web application built with **Spring Boot** and connected to **Azure SQL Database**, deployed via **GitHub Actions** to **Azure App Service**.

---

## Features

-  Add new employee records  
-  View all employees  
-  Update employee information  
-  Delete employee records  
-  RESTful APIs with JSON responses  
-  Continuous Deployment using GitHub Actions  
-  Hosted on Azure App Service

---

## Tech Stack

| Layer            | Technology           |
|------------------|----------------------|
| Backend          | Java + Spring Boot   |
| Database         | Azure SQL Database   |
| CI/CD            | GitHub Actions       |
| Hosting          | Azure App Service    |
| Build Tool       | Maven                |
| Java Version     | 21                   |

---

## REST API Endpoints
Method	Endpoint	Description
GET	/api/employees/getall	List all employees
POST	/api/employees	Add new employee
GET	/api/employees/{id}	Get employee by ID
PUT	/api/employees/{id}	Update employee by ID
DELETE	/api/employees/{id}	Delete employee by ID

