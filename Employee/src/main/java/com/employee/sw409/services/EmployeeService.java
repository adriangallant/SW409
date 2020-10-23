package com.employee.sw409.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.sw409.models.Employee;
import com.employee.sw409.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public ArrayList<Employee> getAllEmployees(){
		return (ArrayList<Employee>) employeeRepository.findAll();
	}
	
	public Optional<Employee> getEmployeeById(int id) {
		return employeeRepository.findById(id);
	}

	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public void updateEmployee(Integer id, Employee employee) {
		employeeRepository.save(employee);
		
	}

	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
		
	}
	
	

}
