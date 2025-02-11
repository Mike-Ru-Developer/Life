package com.education.life.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.education.life.user.repository.UserRepository;

@Controller
public class Authorization {

    @SuppressWarnings("unused")
    private UserRepository userRepository;

    public Authorization(UserRepository userRepository) {
	this.userRepository = userRepository;
    }

    @GetMapping("/authorization")
    public String authorization() {
	return "authorization";
    }
}
