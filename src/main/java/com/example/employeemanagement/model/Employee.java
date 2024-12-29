package com.example.employeemanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "employees")
public class Employee {

    @Id
    private String id;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String email;
    private String address;
    private String education;
    private String employeeId;
    private String inailNumber;
    private String inpsNumber;
    private List<String> certifications;
    private List<byte[]> digitalCertifications;

    // Default Constructor
    public Employee() {}

    // Parameterized Constructor
    public Employee(String id, String name, String surname, String dateOfBirth, String email, String address,
                    String education, String employeeId, String inailNumber, String inpsNumber,
                    List<String> certifications, List<byte[]> digitalCertifications) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.address = address;
        this.education = education;
        this.employeeId = employeeId;
        this.inailNumber = inailNumber;
        this.inpsNumber = inpsNumber;
        this.certifications = certifications;
        this.digitalCertifications = digitalCertifications;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getInailNumber() {
        return inailNumber;
    }

    public void setInailNumber(String inailNumber) {
        this.inailNumber = inailNumber;
    }

    public String getInpsNumber() {
        return inpsNumber;
    }

    public void setInpsNumber(String inpsNumber) {
        this.inpsNumber = inpsNumber;
    }

    public List<String> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<String> certifications) {
        this.certifications = certifications;
    }

    public List<byte[]> getDigitalCertifications() {
        return digitalCertifications;
    }

    public void setDigitalCertifications(List<byte[]> digitalCertifications) {
        this.digitalCertifications = digitalCertifications;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", education='" + education + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", inailNumber='" + inailNumber + '\'' +
                ", inpsNumber='" + inpsNumber + '\'' +
                ", certifications=" + certifications +
                ", digitalCertifications=" + digitalCertifications +
                '}';
    }
}
