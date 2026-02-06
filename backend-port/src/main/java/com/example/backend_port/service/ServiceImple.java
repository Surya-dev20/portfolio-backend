package com.example.backend_port.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend_port.dto.Dto;
import com.example.backend_port.entity.User;
import com.example.backend_port.mapper.UserMapper;
import com.example.backend_port.repository.UserRepository;

@Service
public class ServiceImple implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createMessage(Dto userDto) {
		
		User user = UserMapper.toNewUser(userDto);
		User newUser = userRepository.save(user);
		return newUser;
	}

	@Override
	public List<User> getAllMessage() {
		
		return userRepository.findAll();
	}

	@Override
	public User getById(Long id) {
	    return userRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("User not found with id " + id));
	}

	@Override
	public void delete(Long id) {
		
		userRepository.deleteById(id);
	}

}
