package com.suru.springtest.offers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String showHome() {
		return "home";
	}

	@RequestMapping("/createOffer")
	public String showCreateOffer() {
		return "createOffer";
	}
}
