package com.example.employeemanagement.repository;

import com.example.employeemanagement.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

    // Custom query methods can be defined here if needed

    // Find employees by surname (example of a custom query)
    List<Employee> findBySurname(String surname);

    // Find employee by email (example of a custom query)
    Optional<Employee> findByEmail(String email);
    
    // You can define more custom queries depending on your requirements
}
