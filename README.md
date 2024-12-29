# Employee Management System

A Spring Boot-based Employee Management System that integrates with MongoDB for managing employee data. The application allows for CRUD operations on employee records, which include details such as name, surname, date of birth, email, address, certifications, and digital certifications.

## Features

- Add, update, retrieve, and delete employee records.
- Store employee data in MongoDB.
- RESTful API for interacting with employee data.
- Validation of employee input.
- Centralized exception handling.

## Tech Stack

- **Spring Boot**: The backend framework used for building the REST API.
- **MongoDB**: A NoSQL database for storing employee data.
- **Gradle**: The build automation tool used for dependency management and building the project.
- **JUnit**: Used for testing the application.

## API Endpoints

### POST `/api/employees/`
Create a new employee.

#### Request Body:
```json
{
    "name": "John",
    "surname": "Doe",
    "dateOfBirth": "1985-01-01",
    "email": "john.doe@example.com",
    "address": "123 Main St",
    "education": "Master's Degree",
    "employeeId": "EMP12345",
    "inailNumber": "INAIL98765",
    "inpsNumber": "INPS54321",
    "certifications": ["Java Certification", "AWS Certification"],
    "digitalCertifications": []
}


GET /api/employees/
Retrieve a list of all employees.

GET /api/employees/{id}
Retrieve an employee by ID.

PUT /api/employees/{id}
Update an existing employee by ID.

DELETE /api/employees/{id}
Delete an employee by ID.

Installation
Clone the repository:

bash

git clone https://github.com/username/employee-management-system.git
Navigate to the project directory:

bash

cd employee-management-system
Build and run the application using Gradle:

bash

./gradlew bootRun
The application will be running at http://localhost:8080.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Contributing
Feel free to fork the project and submit pull requests. Contributions are always welcome!


