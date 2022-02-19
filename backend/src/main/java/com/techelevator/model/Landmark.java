package com.techelevator.model;

import java.time.LocalTime;

public class Landmark {

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private int id;
	private String name;
	private String category;
	private String neighborhood;
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	private String address;
	private String city;
	private String state;
	private int zip;
	private int price;
	private int weekdayOpen;
	private int weekdayClose;
	private int weekendOpen;
	private int weekendClose;
	private int minVisitLength;
	private int maxVisitLength;
	public void setMinVisitLength(int minVisitLength) {
		this.minVisitLength = minVisitLength;
	}
	public void setMaxVisitLength(int maxVisitLength) {
		this.maxVisitLength = maxVisitLength;
	}
	private int likes;
	private int dislikes;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getMinVisitLength() {
		return minVisitLength;
	}
	public int getMaxVisitLength() {
		return maxVisitLength;
	}
	private String description;
	private String image;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWeekdayOpen() {
		return weekdayOpen;
	}
	public void setWeekdayOpen(int weekdayOpen) {
		this.weekdayOpen = weekdayOpen;
	}
	public int getWeekdayClose() {
		return weekdayClose;
	}
	public void setWeekdayClose(int weekdayClose) {
		this.weekdayClose = weekdayClose;
	}
	public int getWeekendOpen() {
		return weekendOpen;
	}
	public void setWeekendOpen(int weekendOpen) {
		this.weekendOpen = weekendOpen;
	}
	public int getWeekendClose() {
		return weekendClose;
	}
	public void setWeekendClose(int weekendClose) {
		this.weekendClose = weekendClose;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getDislikes() {
		return dislikes;
	}
	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}
	
	
}
