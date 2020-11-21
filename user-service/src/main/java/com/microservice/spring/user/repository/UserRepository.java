package com.microservice.spring.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.spring.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserId(Long id);

}
