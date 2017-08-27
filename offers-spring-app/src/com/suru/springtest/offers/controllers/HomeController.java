package com.suru.springtest.offers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.suru.springtest.offers.dao.Offer;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String showHome() {
		return "home";
	}

	@RequestMapping("/createOffer")
	public String showCreateOffer(Model model) {
		model.addAttribute("offer", new Offer());
		return "createOffer";
	}
}
