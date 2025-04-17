package com.education.life.user.authentication.service;

import org.springframework.stereotype.Service;

import com.education.life.user.authentication.model.User;
import com.education.life.user.authentication.repository.UserRepository;

@Service
public class AuthenticationFromBD {
    private UserRepository userRepository;

    public AuthenticationFromBD(UserRepository userRepository) {
	this.userRepository = userRepository;
    }

    public User authenticate(String nickname, String password) {

	User user = userRepository.findByNickname(nickname);
	if (user != null && password.equals(user.getPassword())) {
	    return user;
	} else {
	    return null;
	}
    }

}
