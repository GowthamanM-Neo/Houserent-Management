package com.houserent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.houserent.model.UserDao;
import com.houserent.repo.*;
@Controller
public class SignupController {

	@Autowired
	UserRepo UserRepo;
	
	@GetMapping("/signup")
	public String getSign() {
		return "signup";
	}
	
	@PostMapping("/signup")
	public String postSign(@ModelAttribute("userdata") UserDao user) {
		return "redirect:/loginpage";
	}
}
