package com.education.life.subscription.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Subscription {
    @GetMapping("/subscription")
    public String showSubscriptionForm() {
	return "subscription";
    }
}
