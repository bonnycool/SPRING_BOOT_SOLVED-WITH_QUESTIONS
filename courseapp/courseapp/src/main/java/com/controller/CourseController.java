package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Course;
import com.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired 
	private CourseService courseService;
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return courseService.addCourse(course);
	}

}
