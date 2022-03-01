package com.student.gr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.gr.controller.dto.UserRegistrationDto;
import com.student.gr.service.UserService;
@Controller
@RequestMapping("/registration")
public class UserRegController {

	private UserService userService;

	public UserRegController(UserService userService) {
		super();
		this.userService = userService;
	}
	  
	@GetMapping
	public String showReg(Model model) {
		model.addAttribute("user", new UserRegistrationDto());
		return "registration";	
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto userRegistrationDto) {
		
		userService.save(userRegistrationDto);
		return "redirect:/registration?success"; 
	}
}
    