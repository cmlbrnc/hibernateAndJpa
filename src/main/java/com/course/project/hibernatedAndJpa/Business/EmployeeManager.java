package com.course.project.hibernatedAndJpa.Business;

import java.util.List;

import com.course.project.hibernatedAndJpa.DataAccess.IEmployeeDal;
import com.course.project.hibernatedAndJpa.Entities.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * EmployeeManager
 */
@Service
public class EmployeeManager implements IEmployeService {
    private IEmployeeDal employeDal;
    @Autowired
    public EmployeeManager(IEmployeeDal employeDal) {
        this.employeDal = employeDal;
    }
    @Override
    @Transactional
    public List<Employee> getAll() {
        return this.employeDal.getAll();
    }

    @Override
    public void add(Employee employee) {


        //Business :Work rules
        this.employeDal.add(employee);

    }

    @Override
    public void update(Employee employee) {

        //Business :Work rules
        this.employeDal.update(employee);

    }

	@Override
	public void delete(Employee employee) {

        //Business :Work rules

        this.employeDal.delete(employee);
		
	}

    @Override
    public Employee getById(int id) {

        //Business :Work rules
        return  this.employeDal.getById(id);
    }

    

    
}