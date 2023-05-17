package com.skypro.javaind.demo_mockito.controllers;


import com.skypro.javaind.demo_mockito.model.Employee;
import com.skypro.javaind.demo_mockito.services.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/{id}/salary/sum")
    public int sumSalaryByDepartment(@PathVariable int id) {
        return departmentService.sumSalaryByDepartment(id);
    }

    @GetMapping("/{id}/salary/min")
    public int minSalaryByDepartment(@PathVariable int id) {
        return departmentService.minSalaryByDepartment(id);
    }

    @GetMapping("/{id}/salary/max")
    public int maxSalaryByDepartment(@PathVariable int id) {
        return departmentService.maxSalaryByDepartment(id);
    }

    @GetMapping("/{id}/employees")
    public List<Employee> allEmployeesByDepartment(@PathVariable int id) {
        return departmentService.allEmployeesByDepartment(id);
    }

    @GetMapping("/employees")
    public Map<Integer, List<Employee>> findAll(){
        return departmentService.findAll();
    }
}
