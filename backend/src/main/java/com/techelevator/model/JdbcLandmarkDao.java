package com.techelevator.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcLandmarkDao implements LandmarkDao {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcLandmarkDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Landmark saveLandmark(int id, String name, String category, String neighborhood, String address, String city, String state, int zip, int price, int weekdayOpen, int weekdayClose, int weekendOpen, int weekendClose, int minVisitLength, int maxVisitLength, int likes, int dislikes, String description, String image) {
		Landmark newLandmark = new Landmark();
		newLandmark.setId(id);
		newLandmark.setName(name);
		newLandmark.setCategory(category);
		newLandmark.setNeighborhood(neighborhood);
		newLandmark.setAddress(address);
		newLandmark.setCity(city);
		newLandmark.setState(state);
		newLandmark.setZip(zip);
		newLandmark.setPrice(price);
		newLandmark.setWeekdayOpen(weekdayOpen);
		newLandmark.setWeekdayClose(weekdayClose);
		newLandmark.setWeekendOpen(weekendOpen);
		newLandmark.setWeekendClose(weekendClose);
		newLandmark.setMinVisitLength(minVisitLength);
		newLandmark.setMaxVisitLength(maxVisitLength);
		newLandmark.setLikes(likes);
		newLandmark.setDislikes(dislikes);
		newLandmark.setDescription(description);
		newLandmark.setImage(image);
		return newLandmark;
	}

	@Override
	public Landmark getLandmarkById(int id) {
		String sqlSelectLandmarkById = "SELECT * FROM landmarks WHERE id = ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlSelectLandmarkById, id);
		
		if (result.next()) {
			return mapResultToLandmark(result);
		} else {
		return null;
		}
	}

	@Override
	public List<Landmark> getAllLandmarks() {
		List<Landmark> landmarks = new ArrayList<Landmark>();
		String sqlSelectAllLandmarks = "SELECT * FROM landmarks";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllLandmarks);
		
		while (results.next()) {
			Landmark landmark = mapResultToLandmark(results);
			landmarks.add(landmark);
		}
		return landmarks;
	}
	
	private Landmark mapResultToLandmark(SqlRowSet results) {
		Landmark landmark = new Landmark();
		landmark.setId(results.getInt("id"));
		landmark.setName(results.getString("name"));
		landmark.setCategory(results.getString("category"));
		landmark.setNeighborhood(results.getString("neighborhood"));
		landmark.setAddress(results.getString("address"));
		landmark.setCity(results.getString("city"));
		landmark.setState(results.getString("state"));
		landmark.setZip(results.getInt("zip"));
		landmark.setPrice(results.getInt("price"));
		landmark.setWeekdayOpen(results.getInt("weekday_open"));
		landmark.setWeekdayClose(results.getInt("weekday_close"));
		landmark.setWeekendOpen(results.getInt("weekend_open"));
		landmark.setWeekendClose(results.getInt("weekend_close"));		
		landmark.setMinVisitLength(results.getInt("min_visit_length"));
		landmark.setMaxVisitLength(results.getInt("max_visit_length"));
		landmark.setLikes(results.getInt("likes"));
		landmark.setDislikes(results.getInt("dislikes"));
		landmark.setDescription(results.getString("description"));
		landmark.setImage(results.getString("image"));
		return landmark;
	}

}
