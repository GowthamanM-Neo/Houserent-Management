package com.houserent.controller;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.houserent.model.*;
import com.houserent.repo.*;


@Controller
public class HomeController {

	@Autowired
	RoleRepo RoleRepo;
	@Autowired
	UserRepo UserRepo;
	@GetMapping("/")
	public String homePage() {
		
		return "index";
	}
}