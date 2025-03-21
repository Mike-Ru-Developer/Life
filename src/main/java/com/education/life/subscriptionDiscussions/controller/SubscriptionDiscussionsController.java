package com.education.life.subscriptionDiscussions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.education.life.profile.model.User;

import jakarta.servlet.http.HttpSession;

@Controller
public class SubscriptionDiscussionsController {
    @GetMapping("profile/subscription/discussions")
    public String showSubscriptionForm(HttpSession session, Model model) {
	User userProfile = (User) session.getAttribute("currentUser");
	if (userProfile != null) {
	    model.addAttribute("user", userProfile);
	    model.addAttribute("userNickName", userProfile.getNickname());
	    model.addAttribute("userName", userProfile.getName());
	    model.addAttribute("userSurname", userProfile.getSurname());
	    return "subscriptionDiscussions";
	}
	return "redirect:/authorization";

    }

}
