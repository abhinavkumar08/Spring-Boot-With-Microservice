package com.microservice.spring.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.spring.user.entity.User;
import com.microservice.spring.user.repository.UserRepository;
import com.microservice.spring.user.vo.Department;
import com.microservice.spring.user.vo.ResponseInfo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("Inside the save user of the service");
		return userRepository.save(user);

	}

	public ResponseInfo getUserWithDepartment(Long id) {
		log.info("Inside the get user of the service");
		ResponseInfo info = new ResponseInfo();
		User user = userRepository.findByUserId(id);
		if (user != null) {
			Department department = restTemplate
					.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);

			info.setDepartment(department);
			info.setUser(user);
		}

		return info;
	}

}
