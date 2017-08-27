package com.suru.springtest.offers.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.suru.springtest.offers.dao.Offer;
import com.suru.springtest.offers.service.OffersService;

@Controller
@RequestMapping("/offers")
public class OffersController {

	private OffersService offersService;

	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showOffers(HttpSession session) {
		session.setAttribute("edit", -1);
		session.setAttribute("offers", offersService.getOffers());
		return "offers";
	}

	@RequestMapping(path = "/doCreate", method = RequestMethod.POST)
	public String saveOffers(Model model, @Valid Offer offer, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "createOffer";
		} else {
			offersService.createOffer(offer);
			return "doCreate";
		}
	}

	@RequestMapping(path = "/edit/{offerId}", method = RequestMethod.GET)
	public String editOffer(HttpSession session, @PathVariable("offerId") int id) {
		session.setAttribute("edit", id);
		session.setAttribute("offers", offersService.getOffers());
		return "offers";
	}

	@RequestMapping(path = "/edit", method = RequestMethod.POST)
	public String editOfferPost(HttpSession session, HttpServletRequest request) {
		Offer offer = new Offer(Integer.parseInt(session.getAttribute("edit").toString()), request.getParameter("name"),
				request.getParameter("email"), request.getParameter("offer"));
		offersService.updateOffer(offer);
		return "redirect:/offers";
	}

	@RequestMapping(path = "/delete/{offerId}", method = RequestMethod.GET)
	public String deleteOffer(@PathVariable("offerId") int id) {
		offersService.deleteOffer(id);
		return "redirect:/offers";
	}

}
