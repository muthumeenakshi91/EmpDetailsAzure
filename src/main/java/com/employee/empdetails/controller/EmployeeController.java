package com.employee.empdetails.controller;


import org.springframework.web.bind.annotation.*;

import com.employee.empdetails.model.Employee;
import com.employee.empdetails.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/getall")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return service.getEmployeeById(id).orElseThrow();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee updated) {
        Employee employee = service.getEmployeeById(id).orElseThrow();
        employee.setName(updated.getName());
        employee.setDepartment(updated.getDepartment());
        employee.setEmail(updated.getEmail());
        employee.setSalary(updated.getSalary());
        return service.saveEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
    }
}

