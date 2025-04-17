package com.education.life.article.subscription.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.education.life.article.subscription.model.Subscription;
import com.education.life.article.subscription.service.SubscriptionFromBD;
import com.education.life.user.authentication.model.User;

import jakarta.servlet.http.HttpSession;

@Controller
public class SubscriptionsUserToArticles {

    private SubscriptionFromBD subscriptionArticlesService;

    public SubscriptionsUserToArticles(SubscriptionFromBD subscriptionArticlesService) {
	this.subscriptionArticlesService = subscriptionArticlesService;
    }

    @GetMapping("/profile/subscription/articles")
    public String showSubscriptionForm(HttpSession session, Model model) {
	User userProfile = (User) session.getAttribute("currentUser");
	if (userProfile != null) {
	    Long idUser = userProfile.getId();
	    List<Subscription> subscriptions = subscriptionArticlesService.findByUser(idUser);
	    model.addAttribute("subscriptionsUser", subscriptions);
	    return "subscriptionUserToArticles";
	}
	return "redirect:/authorization";

    }

}
