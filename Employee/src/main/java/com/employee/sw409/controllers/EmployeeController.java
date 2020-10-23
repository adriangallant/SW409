package com.employee.sw409.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.sw409.models.Employee;
import com.employee.sw409.services.EmployeeService;

@RestController
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("api/v1/getAllEmployees")
	public ArrayList<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("api/v1/createEmployee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@PutMapping("api/v1/updateEmployee/{employeeId}")
	public void updateEmployee(@PathVariable("employeeId") Integer id, @RequestBody Employee employee) {
		employeeService.updateEmployee(id,employee);
	}
	
	@DeleteMapping("api/v1/deleteEmployee/{employeeId}")
	public void deleteEmployee(@PathVariable("employeeId") Integer id) {
		employeeService.deleteEmployee(id);
	}
	
	@GetMapping("api/v1/getEmployeeById/{employeeId}")
	public Optional<Employee> getEmployeeById(@PathVariable("employeeId") Integer id) {
		return employeeService.getEmployeeById(id);
	}
	

}
