package com.example.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String getHellow() {
		return "main";
	}
	
	@GetMapping("/login")
	public String loginForm() {
		return "login";
	}
}
