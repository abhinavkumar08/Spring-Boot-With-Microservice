package com.microservice.spring.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.spring.department.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findDepartmentById(Long id);

}
