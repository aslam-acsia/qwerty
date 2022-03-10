package com.test1.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test1.demo1.Student;

@RestController
@RequestMapping("/api")
public class Controller {
	@GetMapping("/hello")
	public Student test() {
		System.out.println(1);
		Student s=new Student();
		return s;
	}

}
