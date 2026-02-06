package com.example.backend_port.mapper;

import com.example.backend_port.dto.Dto;
import com.example.backend_port.entity.User;

public class UserMapper{
	public static User toNewUser(Dto dto) {
	    User user = new User();
	    user.setMail(dto.getMail());
	    user.setName(dto.getName());
	    user.setNumber(dto.getNumber());
	    return user;
	}

	public static User toExistingUser(Dto dto) {
	    User user = new User();
	    user.setId(dto.getId());
	    user.setMail(dto.getMail());
	    user.setName(dto.getName());
	    user.setNumber(dto.getNumber());
	    return user;
	}

}
