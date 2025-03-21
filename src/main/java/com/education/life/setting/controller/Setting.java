package com.education.life.setting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class Setting {
    @GetMapping("profile/setting")
    public String showSettingForm(HttpSession httpSession, Model model) {
	return "setting";
    }
}
