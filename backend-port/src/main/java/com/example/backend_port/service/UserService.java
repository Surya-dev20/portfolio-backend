package com.example.backend_port.service;

import java.util.List;

import com.example.backend_port.dto.Dto;
import com.example.backend_port.entity.User;

public interface UserService {

	User createMessage(Dto userDto);
	List<User> getAllMessage();
	User getById(Long id);
	void delete(Long id);
	
}
