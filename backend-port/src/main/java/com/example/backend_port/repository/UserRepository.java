package com.example.backend_port.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend_port.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	
}
