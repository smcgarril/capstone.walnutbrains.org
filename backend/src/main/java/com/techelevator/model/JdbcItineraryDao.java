package com.techelevator.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcItineraryDao implements ItineraryDao {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcItineraryDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Itinerary saveItinerary(int id, int userId, String name, String homeBase, Date date, LocalTime startTime, String route,
			int landmark1, int landmark2, int landmark3, int landmark4, int landmark5, int landmark6, int landmark7, int disabled) {
		Itinerary newItinerary = new Itinerary();
		newItinerary.setId(id);
		newItinerary.setUserId(userId);
		newItinerary.setName(name);
		newItinerary.setHomeBase(homeBase);
		newItinerary.setDate(date);
		newItinerary.setStartTime(startTime);
		newItinerary.setRoute(route);
		newItinerary.setLandmark1(landmark1);
		newItinerary.setLandmark2(landmark2);
		newItinerary.setLandmark3(landmark3);
		newItinerary.setLandmark4(landmark4);
		newItinerary.setLandmark5(landmark5);
		newItinerary.setLandmark6(landmark6);
		newItinerary.setLandmark7(landmark7);
		newItinerary.setDisabled(disabled);
		return null;
	}

	@Override
	public Itinerary deleteItinerary(int id) {
		
		String sqlDeleteRecord = "UPDATE itinerary SET disabled = '1' WHERE id = ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlDeleteRecord, id);
		
		if(result.next()) {
			return mapResultToItinerary(result);
		} else {
		return null;
		}
	}

	@Override
	public List<Itinerary> getAllItineraries() {
		List<Itinerary> itineraries = new ArrayList<Itinerary>();
		String sqlSelectAllItineraries = "SELECT * FROM itinerary";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlSelectAllItineraries);
		
		while (result.next()) {
			Itinerary itinerary = mapResultToItinerary(result);
			itineraries.add(itinerary);
		}
		return itineraries;
	}
	
	@Override
	public Itinerary getItineraryById(int id) {
		String sqlSelectItineraryById = "SELECT * FROM itinerary WHERE id = ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlSelectItineraryById, id);
		
		if(result.next()) {
			return mapResultToItinerary(result);
		} else {
		return null;
		}
	}

	private Itinerary mapResultToItinerary(SqlRowSet result) {
		Itinerary itinerary = new Itinerary();
		itinerary.setId(result.getInt("id"));
		itinerary.setUserId(result.getInt("user_id"));
		itinerary.setName(result.getString("name"));
		itinerary.setHomeBase(result.getString("home_base"));
		itinerary.setDate(result.getDate("date"));
		itinerary.setStartTime(result.getTime("start_time").toLocalTime());
		itinerary.setRoute(result.getString("route"));
		itinerary.setLandmark1(result.getInt("landmark1"));
		itinerary.setLandmark2(result.getInt("landmark2"));
		itinerary.setLandmark3(result.getInt("landmark3"));
		itinerary.setLandmark4(result.getInt("landmark4"));
		itinerary.setLandmark5(result.getInt("landmark5"));
		itinerary.setLandmark6(result.getInt("landmark6"));
		itinerary.setLandmark7(result.getInt("landmark7"));
		itinerary.setDisabled(result.getInt("disabled"));
		
		return itinerary;
	}

	@Override
	public List<Itinerary> getAllItinerariesByUserId(int userId) {
		List<Itinerary> itineraries = new ArrayList<Itinerary>();
		String sqlSelectAllItineraries = "SELECT * FROM itinerary WHERE user_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllItineraries, userId);
		
		while (results.next()) {
			Itinerary itinerary = mapResultToItinerary(results);
			itineraries.add(itinerary);
		}
		return itineraries;
	}


}
