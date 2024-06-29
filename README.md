# StaffManagementAPI

## Overview
The **StaffManagementAPI** is a RESTful web service built using Java Spring Boot. It provides endpoints for managing a list of employees, including retrieving all employee data. This project demonstrates the creation of a basic web service that can handle HTTP GET requests and return JSON responses.

## Table of Contents
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

### Prerequisites
Before you begin, ensure you have the following installed on your machine:
- Java Development Kit (JDK) 8 or higher
- Gradle 8.7 or higher
- Git

### Installation
1. **Clone the repository:**
   ```sh
   git clone https://github.com/Waltberry/StaffManagementAPI
   cd StaffManagementAPI
   ```

2. **Build the project:**
   ```sh
   ./gradlew build
   ```

### Running the Application
To run the application locally, use the following command:
```sh
./gradlew bootRun
```

This will start the web service, which will be accessible at `http://localhost:8080`.

## API Endpoints

### Get All Employees
- **URL:** `/employees`
- **Method:** `GET`
- **Response:** Returns a JSON array of all employees.

#### Example Response
```json
[
  {
    "employeeId": "1",
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "title": "Software Engineer"
  },
  {
    "employeeId": "2",
    "firstName": "Jane",
    "lastName": "Smith",
    "email": "jane.smith@example.com",
    "title": "Product Manager"
  },
  {
    "employeeId": "3",
    "firstName": "Michael",
    "lastName": "Johnson",
    "email": "michael.johnson@example.com",
    "title": "Data Analyst"
  }
]
```

## Project Structure
The project follows a standard Spring Boot project structure:
```
StaffManagementAPI
│   build.gradle
│   README.md
│
└───src
    └───main
        └───java
            └───com
                └───example
                    └───restservice
                        │   Employee.java
                        │   EmployeeController.java
                        │   EmployeeManager.java
                        │   Employees.java
                        │   RestServiceApplication.java
```

### File Descriptions
- **Employee.java:** Represents the Employee resource with fields for employee details.
- **Employees.java:** Manages a list of Employee objects.
- **EmployeeManager.java:** Initializes the Employees class with hardcoded employee data.
- **EmployeeController.java:** Handles HTTP GET requests and returns employee data.
- **RestServiceApplication.java:** The main entry point for the Spring Boot application.

## Technologies Used
- **Java Spring Boot:** Framework used for building the RESTful web service.
- **Gradle:** Build tool for managing dependencies and building the project.

## Contributing
Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.

## License
This project is licensed under the MIT License.