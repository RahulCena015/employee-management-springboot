package com.employeemanagement.service;

import java.util.List;

import com.employeemanagement.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	public Employee createEmployee(Employee employee);
	public Employee findEmployeeById(Long id);
	public void deleteEmployeeById(Long id);
	public Employee updateEmployee(Employee employee);

}
