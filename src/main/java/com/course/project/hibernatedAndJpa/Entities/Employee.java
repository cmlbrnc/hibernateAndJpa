package com.course.project.hibernatedAndJpa.Entities;

import javax.persistence.*;


/**
 * Customer
 */
@Entity
@Table(name="employees2")
public class Employee {
    
    @Id
    @Column(name="employeeNumber")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeNumber;
    
    @Column(name="lastName")
    private String lastName;
    
    @Column(name="firstName")
    private String firstName;
    
    @Column(name="extension")
    private String extension;
    
    @Column(name="email")
    private String email;
    
    @Column(name="officeCode")
    private String officeCode;
    
    @Column(name="reportsTo")
    private int reportsTo;
    
    @Column(name="jobTitle")
    private String jobTitle;


    public Employee() {
    }

    
    public Employee(int employeeNumber, String lastName, String firstName, String extension, String email,
            String officeCode, int reportsTo, String jobTitle) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.extension = extension;
        this.email = email;
        this.officeCode = officeCode;
        this.reportsTo = reportsTo;
        this.jobTitle = jobTitle;
    }


    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public int getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(int reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

   

}