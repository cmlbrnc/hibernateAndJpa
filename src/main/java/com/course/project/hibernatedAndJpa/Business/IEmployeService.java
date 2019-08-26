package com.course.project.hibernatedAndJpa.Business;

import java.util.List;

import com.course.project.hibernatedAndJpa.Entities.Employee;

/**
 * IEmployeService
 */
public interface IEmployeService {

    List<Employee> getAll();
    Employee getById(int id);
    void add(Employee employee);
    void update(Employee employee);
    void delete(Employee employee);

    
}