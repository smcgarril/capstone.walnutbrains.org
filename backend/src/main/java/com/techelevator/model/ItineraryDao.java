package com.techelevator.model;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public interface ItineraryDao {
	
	public Itinerary saveItinerary(int id, int userId, String name, String homeBase, Date date, LocalTime startTime, String route, int landmark1, int landmark2, int landmark3, int landmark4, int landmark5, int landmark6, int landmark7, int disabled);

	public Itinerary deleteItinerary(int id);
	
	public List<Itinerary> getAllItineraries();
	
	public List<Itinerary> getAllItinerariesByUserId(int userId);

	public Itinerary getItineraryById(int id);
	
}
