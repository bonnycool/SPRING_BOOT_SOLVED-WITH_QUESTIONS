package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Course;
import com.entity.Student;
import com.repository.CourseRepository;
import com.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;

	
	public Student addStudent(Student student,Long courseId)
	{
		Optional<Course> existing=courseRepository.findById(courseId);
		
		student.setCourse(existing.get());
		return studentRepository.save(student);
	}
	
	public Optional<Student> listOfStudents(Long studentId)
	{
		return studentRepository.findById(studentId);
	}

}
