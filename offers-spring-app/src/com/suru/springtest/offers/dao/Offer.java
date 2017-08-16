package com.suru.springtest.offers.dao;

public class Offer {

	private Integer id;
	private String userName;
	private String email;
	private String offerText;

	public Offer() {
	}

	public Offer(Integer id, String userName, String email, String offerText) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.offerText = offerText;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOfferText() {
		return offerText;
	}

	public void setOfferText(String offerText) {
		this.offerText = offerText;
	}

	@Override
	public String toString() {
		return "Offer [id=" + id + ", userName=" + userName + ", email=" + email + ", offerText=" + offerText + "]";
	}

}
