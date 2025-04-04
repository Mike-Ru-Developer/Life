package com.education.life.subscriptionDiscussions.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.education.life.profile.model.User;
import com.education.life.subscriptionDiscussions.model.SubscriptionArticles;
import com.education.life.subscriptionDiscussions.service.SubscriptionArticlesService;

import jakarta.servlet.http.HttpSession;

@Controller
public class SubscriptionDiscussionsController {

    private SubscriptionArticlesService subscriptionArticlesService;

    public SubscriptionDiscussionsController(SubscriptionArticlesService subscriptionArticlesService) {
	this.subscriptionArticlesService = subscriptionArticlesService;
    }

    @GetMapping("/profile/subscription/discussions")
    public String showSubscriptionForm(HttpSession session, Model model) {
	User userProfile = (User) session.getAttribute("currentUser");
	if (userProfile != null) {
	    Long idUser = userProfile.getId();
	    List<SubscriptionArticles> subscriptions = subscriptionArticlesService.findByUser(idUser);
	    model.addAttribute("subscriptionsUser", subscriptions);
	    return "subscriptionDiscussions";
	}
	return "redirect:/authorization";

    }

}
