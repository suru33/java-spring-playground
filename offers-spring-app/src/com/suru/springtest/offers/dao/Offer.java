package com.suru.springtest.offers.dao;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Offer implements Serializable {

	private static final long serialVersionUID = 4993767904897058006L;
	
	private Integer id;
	@Size(min = 5, max = 100, message = "Name must be between 5 and 100 characters.")
	private String userName;
	@NotNull
	@Pattern(regexp = ".*\\\\@.*\\\\..*", message = "Invalid email")
	private String email;
	@Size(min = 5, max = 100, message = "Text must be between 20 and 255 characters.")
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
