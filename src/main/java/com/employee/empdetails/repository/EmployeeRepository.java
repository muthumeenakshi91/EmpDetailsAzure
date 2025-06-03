package com.employee.empdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.empdetails.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
