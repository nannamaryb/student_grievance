package com.student.gr.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.gr.controller.dto.UserRegistrationDto;
import com.student.gr.model.Role;
import com.student.gr.model.User;
import com.student.gr.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	 
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getName(),
				             registrationDto.getEmail(),
				             registrationDto.getDepartment(),
				             registrationDto.getPassword(),
				             Arrays.asList(new Role("ROLE_USER")));
		return userRepository.save(user);
	}

}
