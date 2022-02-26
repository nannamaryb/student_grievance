package com.student.gr.service;

import com.student.gr.controller.dto.UserRegistrationDto;
import com.student.gr.model.User;

public interface UserService {

	User save(UserRegistrationDto registrationDto);
}
