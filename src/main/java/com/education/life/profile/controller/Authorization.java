package com.education.life.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.education.life.profile.model.User;
import com.education.life.profile.service.UserAuthentication;

import jakarta.servlet.http.HttpSession;

@Controller
public class Authorization {

    private final UserAuthentication userAuthentication;

    public Authorization(UserAuthentication userAuthentication) {
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
	    return "redirect:/profile/subscription/discussions";
	}
	return "authorization";
    }

}