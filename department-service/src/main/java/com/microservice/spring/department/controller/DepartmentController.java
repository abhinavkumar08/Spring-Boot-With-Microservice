package com.microservice.spring.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.spring.department.entity.Department;
import com.microservice.spring.department.service.DepartmentService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Inside the save department of the Department Controller.");
		return departmentService.saveDepartment(department);
		
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@ PathVariable Long id) {
		log.info("Inside the find department of the Depatment Controller");
		return departmentService.findDepartmentById(id);
	}

}
