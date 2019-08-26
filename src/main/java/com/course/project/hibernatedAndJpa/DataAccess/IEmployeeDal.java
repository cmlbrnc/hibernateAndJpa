package com.course.project.hibernatedAndJpa.DataAccess;

import com.course.project.hibernatedAndJpa.Entities.Employee;
import java.util.List;

/**
 * IEmployeeDal
 */
public interface IEmployeeDal {
  List<Employee> getAll();
  Employee getById(int id);
  void add(Employee employee);
  void update(Employee employee);
  void delete(Employee employee);

  
    
}