package com.skypro.javaind.demo_mockito.service;



import com.skypro.javaind.demo_mockito.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface DepartmentService {
    String sumSalaryByDepartment(int department);
    Optional<Employee> findEmployeeMinSalaryByDepartment(int department);
    Optional<Employee> findEmployeeMaxSalaryByDepartment(int department);
    List<Employee> allEmployeesByDepartment(int department);
    Map<Integer, List<Employee>> findAll();
}

