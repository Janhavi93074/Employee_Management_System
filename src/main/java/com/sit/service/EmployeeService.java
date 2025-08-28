package com.sit.service;

import java.util.List;

import com.sit.model.Employee;

public interface EmployeeService {
	 List<Employee> getAllEmployees();
	    Employee getEmployeeById(Long id);
	    Employee saveEmployee(Employee employee);
	    Employee updateEmployee(Long id, Employee employee);
	    void deleteEmployee(Long id);
}
