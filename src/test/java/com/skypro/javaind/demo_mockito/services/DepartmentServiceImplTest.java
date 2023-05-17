package com.skypro.javaind.demo_mockito.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class DepartmentServiceImplTest {
    @Mock
    private EmployeeServiceImpl employeeService;

    private DepartmentServiceImpl out;

    @BeforeEach
    void setUp() {
        out = new DepartmentServiceImpl(employeeService);
    }

    @Test
    void TestSumSalaryByDepartment() {
    }

    @Test
    void minSalaryByDepartment() {
    }

    @Test
    void maxSalaryByDepartment() {
    }

    @Test
    void allEmployeesByDepartment() {
    }

    @Test
    void findAll() {
    }
}