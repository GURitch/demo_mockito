package com.skypro.javaind.demo_mockito.service;





import com.skypro.javaind.demo_mockito.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName, int salary, int department);
    Employee removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
    Collection<Employee> findAllEmployees();
}

