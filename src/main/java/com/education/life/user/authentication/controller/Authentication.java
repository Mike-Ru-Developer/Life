package com.education.life.user.authentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.education.life.user.authentication.model.User;
import com.education.life.user.authentication.service.AuthenticationFromBD;

import jakarta.servlet.http.HttpSession;

@Controller
public class Authentication {

    private final AuthenticationFromBD userAuthentication;

    public Authentication(AuthenticationFromBD userAuthentication) {
	this.userAuthentication = userAuthentication;
    }

    @GetMapping("/authorization")
    public String showAuthorizationForm() {
	return "authorization";
    }

    @PostMapping("/authorization")
    public String authorization(@RequestParam String nickname, @RequestParam String password, HttpSession session) {
	User user = userAuthentication.authenticate(nickname, password);
	if (user != null) {
	    session.setAttribute("currentUser", user);
	    return "redirect:/profile/subscription/articles";
	}
	return "authorization";
    }

}