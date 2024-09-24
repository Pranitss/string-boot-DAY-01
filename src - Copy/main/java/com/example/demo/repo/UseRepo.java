package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UseRepo extends JpaRepository<User,Integer> {
	User findByUname(String username);
	}