package com.microservice.spring.user.vo;

import com.microservice.spring.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseInfo {
	
	private User user;
	private Department department;

}
