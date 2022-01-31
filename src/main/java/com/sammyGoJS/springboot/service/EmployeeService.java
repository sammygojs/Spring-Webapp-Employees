package com.sammyGoJS.springboot.service;

import java.util.List;

import com.sammyGoJS.springboot.model.Employee;

public interface EmployeeService {
	List<Employee>getAllEmployees();
	Employee saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}
