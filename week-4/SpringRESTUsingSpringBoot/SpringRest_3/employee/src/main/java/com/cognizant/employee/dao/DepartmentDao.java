package com.cognizant.employee.dao;

import com.cognizant.employee.model.Department;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentDao {

    private static final List<Department> DEPARTMENT_LIST;

    static {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        DEPARTMENT_LIST = context.getBean("departmentList", List.class);
        context.close();
    }

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}
