package com.course.project.hibernatedAndJpa.restApi;

import java.util.List;

import com.course.project.hibernatedAndJpa.Business.IEmployeService;
import com.course.project.hibernatedAndJpa.Entities.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EmployeeController
 */
@RestController
@RequestMapping("/api")
public class EmployeeController {

    private IEmployeService employeeService;

    @Autowired
    public EmployeeController(IEmployeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/employees")
    public List<Employee> get() {
        return employeeService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody  Employee employee) {

         employeeService.add(employee);
        
    }

    @PostMapping("/update")
    public void update(@RequestBody Employee employee) {

         employeeService.update(employee);
        
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Employee employee) {

         employeeService.delete(employee);
        
    }

    @GetMapping("/employee/{id}")
    public Employee getByıd(@PathVariable int id) {

         return employeeService.getById(id);
        
    }



    
}