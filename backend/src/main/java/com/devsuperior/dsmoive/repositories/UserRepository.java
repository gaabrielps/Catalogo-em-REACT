package com.devsuperior.dsmoive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmoive.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
