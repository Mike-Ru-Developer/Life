package com.education.life.subscriptionDiscussions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubscriptionDiscussionsController {
    @GetMapping("/subscription/discussions")
    public String showSubscriptionForm() {
	return "subscriptionDiscussions";
    }
}
