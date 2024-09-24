package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UseRepo;
import com.example.demo.repo.UserDetailsImpliments;


@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	UseRepo db;
	
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User user=db.findByUname(username);
		
		if(user==null)
			throw new UsernameNotFoundException("User not found");
		
		return new UserDetailsImpliments(user);
	}

}
