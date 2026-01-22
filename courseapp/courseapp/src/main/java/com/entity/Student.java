package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {

	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long studentId;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long studentId, String firstName, String lastName, String email, Course course) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.LastName = lastName;
		this.email = email;
		this.course = course;
	}

	private String firstName;
	private String LastName;
	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	private String email;
	
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;
}
