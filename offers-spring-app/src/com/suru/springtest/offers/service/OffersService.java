package com.suru.springtest.offers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.suru.springtest.offers.dao.Offer;
import com.suru.springtest.offers.dao.OffersDAO;

@Service("offersService")
public class OffersService {
	private OffersDAO offersDAO;

	@Autowired
	@Qualifier("offerDao")
	public void setOffersDAO(OffersDAO offersDAO) {
		this.offersDAO = offersDAO;
	}

	public List<Offer> getOffers() {
		return offersDAO.getOffers();
	}

	
	public void createOffer(Offer offer) {
		offersDAO.createOffer(offer);
	}
	
	public void updateOffer(Offer offer) {
		offersDAO.updateOffer(offer);
	}
	
	public void deleteOffer(int id) {
		offersDAO.deleteOffer(id);
	}
	
	public Offer getOffer(int id) {
		return offersDAO.getOffer(id);
	}
}
