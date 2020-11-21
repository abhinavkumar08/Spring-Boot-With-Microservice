package com.microservice.spring.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.spring.department.entity.Department;
import com.microservice.spring.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside the save department of the service");
		return departmentRepository.save(department);
		
	}

	public Department findDepartmentById(Long id) {
		log.info("Inside the find department of the service");
		return departmentRepository.findDepartmentById(id);
	}

}
