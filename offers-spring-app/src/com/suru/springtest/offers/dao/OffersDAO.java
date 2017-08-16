package com.suru.springtest.offers.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component("offerDao")
public class OffersDAO {

	private NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public List<Offer> getOffers() {
		String sql = "select * from offers";
		return jdbcTemplate.query(sql, new RowMapper<Offer>() {

			@Override
			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Offer offer = new Offer();
				offer.setId(rs.getInt("offer_id"));
				offer.setUserName(rs.getString("user_name"));
				offer.setEmail(rs.getString("email"));
				offer.setOfferText(rs.getString("offer_text"));
				return offer;
			}
		});
	}

	public boolean createOffer(Offer offer) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);
		String sql = "INSERT INTO offers (user_name, email, offer_text) VALUES (:userName, :email, :offerText)";
		return jdbcTemplate.update(sql, params) == 1;
	}

	public boolean deleteOffer(int id) {
		MapSqlParameterSource params = new MapSqlParameterSource("id", id);
		String sql = "DELETE FROM offers WHERE offer_id = :id";
		return jdbcTemplate.update(sql, params) == 1;
	}

	public boolean updateOffer(Offer offer) {
		BeanPropertySqlParameterSource parms = new BeanPropertySqlParameterSource(offer);
		String sql = "UPDATE offers SET offer_id = :id, " + "user_name = :userName, email = :email, "
				+ "offer_text = :offerText WHERE offer_id = :id";
		return jdbcTemplate.update(sql, parms) == 1;
	}

	public Offer getOffer(int id) {
		MapSqlParameterSource params = new MapSqlParameterSource("id", id);
		String sql = "SELECT * FROM offers WHERE id = :id";
		return jdbcTemplate.queryForObject(sql, params, new RowMapper<Offer>() {

			@Override
			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Offer offer = new Offer();
				offer.setId(rs.getInt("offer_id"));
				offer.setUserName(rs.getString("user_name"));
				offer.setEmail(rs.getString("email"));
				offer.setOfferText(rs.getString("offer_text"));
				return offer;
			}
		});
	}

}
