package com.education.life.articles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class Articles {

    @GetMapping("/profile/articles")
    public String showArticlesForm(HttpSession session, Model model) {
	return "articlesMain";
    }
}
