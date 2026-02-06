package com.example.backend_port;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend_port.dto.Dto;
import com.example.backend_port.entity.User;
import com.example.backend_port.service.UserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping
public class Controller {
	@Autowired
	private UserService userService;
	
	@PostMapping("/send")
	User createMessage(@RequestBody Dto userDto) {
		return userService.createMessage(userDto);
	}
	
	@GetMapping("/all")
	List<User> getAllMessage(){
		return userService.getAllMessage();
	}
	
	@GetMapping("/{id}")
	User getById(@PathVariable Long id) {
		return userService.getById(id);
	}
	
	@DeleteMapping("/{id}")
	void delete(@PathVariable Long id) {
		userService.delete(id);
	}
}
