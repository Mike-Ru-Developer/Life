package com.education.life.user.service;

import org.springframework.stereotype.Service;

import com.education.life.user.model.User;
import com.education.life.user.repository.UserRepository;

@Service
public class UserAuthentication {
    private UserRepository userRepository;

    public UserAuthentication(UserRepository userRepository) {
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
