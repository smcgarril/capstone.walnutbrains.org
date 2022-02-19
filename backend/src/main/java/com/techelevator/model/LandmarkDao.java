package com.techelevator.model;

import java.time.LocalTime;
import java.util.List;

public interface LandmarkDao {
		
	public Landmark getLandmarkById(int id);
	
	public List<Landmark> getAllLandmarks();

	public Landmark saveLandmark(int id, String name, String category, String neighborhood, String address, String city, String state, int zip, int price,
			int weekdayOpen, int weekdayClose, int weekendOpen, int weekendClose, int minVisitLength, int maxVisitLength, int likes, int dislikes, String description, String image);
	
	
}
