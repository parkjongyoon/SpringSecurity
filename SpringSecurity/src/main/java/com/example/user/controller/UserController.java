package com.example.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.user.domain.User;
import com.example.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public String selectUser(Model model) {
		List<User> userList = userService.selectUser();
		model.addAttribute("userList", userList);
		return "userList";
	}
	
	@GetMapping("/join")
	public String joinForm() {
		return "join";
	}
	
	@PostMapping("/join")
	public String createUser(User user) {
		userService.createUser(user);
		return "redirect:login";
	}
	
	
}
