
package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Student;
import com.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students/{courseId}")
	public Student addStudent(@RequestBody Student student,@PathVariable Long courseId)
	{
		return studentService.addStudent(student, courseId);
	}
	
	
	@GetMapping("/students/{studentId}")
	public Optional<Student> listOfStudent(@PathVariable Long studentId)
	{
		return studentService.listOfStudents(studentId);
	}

}
