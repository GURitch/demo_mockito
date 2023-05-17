package com.skypro.javaind.demo_mockito.controller;


import com.skypro.javaind.demo_mockito.model.Employee;
import com.skypro.javaind.demo_mockito.service.DepartmentService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/{id}/salary/sum")
    public String sumSalaryByDepartment(@PathVariable int id) {
        return departmentService.sumSalaryByDepartment(id);
    }

    @GetMapping("/{id}/salary/min")
    public Optional<Employee> minSalaryByDepartment(@PathVariable int id) {
        return departmentService.findEmployeeMinSalaryByDepartment(id);
    }

    @GetMapping("/{id}/salary/max")
    public Optional<Employee> maxSalaryByDepartment(@PathVariable int id) {
        return departmentService.findEmployeeMaxSalaryByDepartment(id);
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
