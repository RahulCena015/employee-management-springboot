package com.employeemanagement.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.exception.UserNotFoundException;
import com.employeemanagement.model.Employee;
import com.employeemanagement.repository.EmployeeRepository;
import com.employeemanagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public Employee findEmployeeById(Long id) {
		return repo.findById(id).orElseThrow(()-> new UserNotFoundException("User with id"+id+"is not avialable"));
	}

	@Override
	public void deleteEmployeeById(Long id) {
		 repo.deleteById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return repo.save(employee);
	}

}
