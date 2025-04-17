package com.education.life.user.subscription.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class SubscriptionUserToPeople {
    @GetMapping("/profile/subscription/people")
    public String showPeopleForm(HttpSession httpSession, Model model) {
	return "subscriptionUserToPeople";
    }
}
