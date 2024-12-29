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

### POST /api/employees/
Create a new employee.

### GET /api/employees/
Retrieve a list of all employees.

### GET /api/employees/{id}
Retrieve an employee by ID.

### PUT /api/employees/{id}
Update an existing employee by ID.

### DELETE /api/employees/{id}
Delete an employee by ID.

## Installation
** Clone the repository:**

    git clone https://github.com/username/employee-management-system.git


** Navigate to the project directory: **
    
    cd employee-management-system

** Build and run the application using Gradle: **

    ./gradlew bootRun
    
------------------------------------------------------------------------------------------

## The application will be running at http://localhost:8080.

------------------------------------------------------------------------------------------
## License
MIT License

Copyright (c) [Year] [Author]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.


## Contributing
Feel free to fork the project and submit pull requests. 
Contributions are always welcome!

------------------------------------------------------------------------------------------
**Request Body**:
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
