package com.education.life.article.generalList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class AllArticles {

    @GetMapping("/profile/articles")
    public String showArticlesForm(HttpSession session, Model model) {
	return "generalListArticles";
    }
}
