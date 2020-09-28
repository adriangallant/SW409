package com.StudentCRUDDemo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentCRUDDemo.models.Student;
import com.StudentCRUDDemo.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	//CREATE
	@PostMapping("api/v1/createStudent")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@GetMapping("api/v1/getAllStudents")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@PutMapping("api/v1/updateStudent/{studentId}")
	public void updateStudent(@PathVariable("studentId") Integer id, @RequestBody Student student) {
		studentService.updateStudent(id, student);
	}
	
	@DeleteMapping("/api/v1/deleteStudent/{studentId}")
	public void deleteStudent(@PathVariable("studentId") Integer id) {
		studentService.deleteStudent(id);
	}
	
	@GetMapping("api/v1/getStudent/{studentId}")
	public Optional<Student> getStudent(@PathVariable("studentId") Integer id) {
		return studentService.getStudent(id);
	}
}
