package com.StudentCRUDDemo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentCRUDDemo.models.Student;
import com.StudentCRUDDemo.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public StudentService() {
		
	}
	
	List<Student> studentList = new ArrayList<>();
	
	//CREATE
	public Student createStudent(Student student) {
		studentRepository.save(student);
		//studentList.add(student);
		return student;
	}
	
	//READ
	public List<Student> getAllStudents(){
		return (List<Student>) studentRepository.findAll();
	}
	
	//UPDATE
	public void updateStudent(Integer id, Student student) {
		/*
		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getId() == id) {
				studentList.set(i, student);
			}
		}
		*/
		studentRepository.save(student);
	}
	
	//DELETE
	public void deleteStudent(Integer id) {
		/*
		for(int i = 0; i <studentList.size(); i++) {
			if(studentList.get(i).getId() == id) {
				studentList.remove(i);
			}
		}
		*/
		studentRepository.deleteById(id);
	}
	
	//GET
	public Optional<Student> getStudent(Integer id) {
		return studentRepository.findById(id);
	}

}
