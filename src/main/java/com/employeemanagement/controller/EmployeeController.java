package com.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.model.Employee;
import com.employeemanagement.serviceimpl.EmployeeServiceImpl;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeService;
	
	@PostMapping("/createEmployee")
	public Employee createUser(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}

	@GetMapping("/find/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return employeeService.findEmployeeById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmployeeById(@PathVariable Long id) {
		employeeService.deleteEmployeeById(id);
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
}
