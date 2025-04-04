package com.education.life.subscriptonPeople.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class People {
    @GetMapping("/profile/subscription/users")
    public String showPeopleForm(HttpSession httpSession, Model model) {
	return "people";
    }
}
