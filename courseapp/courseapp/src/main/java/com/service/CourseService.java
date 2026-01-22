package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Course;
import com.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired 
	private CourseRepository courseRepository;
	
	public Course addCourse(Course course)
	{
		return courseRepository.save(course);
	}

}
