package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	String fun()
	{
		return "page.jsp";
	}
	
	@RequestMapping("/login")
	String fun2()
	{
		return "login.jsp";
	}
	
	@RequestMapping("/logout-success")
	String fun3()
	{
		return "logout.jsp";
	}

}
