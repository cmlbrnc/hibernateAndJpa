package com.course.project.hibernatedAndJpa.DataAccess;

import java.util.List;


import javax.persistence.EntityManager;


import com.course.project.hibernatedAndJpa.Entities.Employee;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * HibernateEmployeeDal
 */
//JPA
@Repository
public class HibernateEmployeeDal implements IEmployeeDal {
     
    private EntityManager entityManager;

    @Autowired ///Enejction Session Factory
    public HibernateEmployeeDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

   //AOP: ASpect oriented PRogramiing  
    @Override
    @Transactional
    public List<Employee> getAll() {
        Session session=entityManager.unwrap(Session.class);

        List<Employee> employees=session.createQuery("from Employee",Employee.class).getResultList();
        return employees;
    }

    @Override
    @Transactional
    public void add(Employee employee) {

        Session session=entityManager.unwrap(Session.class);
        System.out.println(employee.getFirstName());
        session.saveOrUpdate(employee);

    }

    @Override
    @Transactional
    public void update(Employee employee) {
        Session session=entityManager.unwrap(Session.class);
        session.saveOrUpdate(employee);

    }

    @Override
    @Transactional
	public void delete(Employee employee) {

        Session session=entityManager.unwrap(Session.class);
        Employee employeeToDelete=session.get(Employee.class,employee.getEmployeeNumber());
        session.delete(employeeToDelete);
		
	}

    @Override
    @Transactional
    public Employee getById(int id) {

        Session session=entityManager.unwrap(Session.class);

        Employee employee= session.get(Employee.class,id);
        return employee;
    }

   
    
}