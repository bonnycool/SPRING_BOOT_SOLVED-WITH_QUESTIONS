package com.course.courseapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages="com")
@EntityScan(basePackages="com.entity")
@EnableJpaRepositories("com.repository")
@SpringBootApplication
public class CourseappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseappApplication.class, args);
	}

}
