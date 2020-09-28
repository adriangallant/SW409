package com.StudentCRUDDemo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.StudentCRUDDemo.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	

}
