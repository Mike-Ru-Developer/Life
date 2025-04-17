package com.education.life.user.setting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class SettingUser {
    @GetMapping("/profile/setting")
    public String showSettingForm(HttpSession httpSession, Model model) {
	return "setting";
    }
}
