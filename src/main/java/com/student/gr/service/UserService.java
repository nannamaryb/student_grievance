package com.student.gr.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.student.gr.controller.dto.UserRegistrationDto;
import com.student.gr.model.User;

public interface UserService extends UserDetailsService {

	User save(UserRegistrationDto registrationDto); 
}
