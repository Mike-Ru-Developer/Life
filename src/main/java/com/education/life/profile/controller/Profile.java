package com.education.life.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.education.life.profile.model.User;

import jakarta.servlet.http.HttpSession;

@Controller
public class Profile {
    @GetMapping("/profile")
    public String showUserProfile(HttpSession session, Model model) {
	User userProfile = (User) session.getAttribute("currentUser");
	if (userProfile != null) {
	    model.addAttribute("user", userProfile);
	    model.addAttribute("userNickName", userProfile.getNickname());
	    model.addAttribute("userName", userProfile.getName());
	    model.addAttribute("userSurname", userProfile.getSurname());
	    return "profile";
	}
	return "redirect:/authorization";

    }
}
