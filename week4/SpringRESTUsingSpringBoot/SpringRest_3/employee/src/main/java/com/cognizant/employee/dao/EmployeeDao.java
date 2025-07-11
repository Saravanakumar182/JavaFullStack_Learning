package com.cognizant.employee.dao;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.employee.model.Employee;

import java.util.List;

@Repository
public class EmployeeDao {

    private static final List<Employee> EMPLOYEE_LIST;

    static {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        EMPLOYEE_LIST = context.getBean("employeeList", List.class);
        context.close();
    }

    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}
