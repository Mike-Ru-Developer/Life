package com.education.life.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Authorization {
    @GetMapping("/authorization")
    public String authorization() {
	return "authorization";
    }
}
