package com.techelevator.model;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class Itinerary {

	private int id;
	private int userId;
	private String name;
	private String homeBase;
	private Date date;
	private LocalTime startTime;
	private String route;
	private int landmark1;
	private int landmark2;
	private int landmark3;
	private int landmark4;
	private int landmark5;
	private int landmark6;
	private int landmark7;
	private int disabled;


	public int getDisabled() {
		return disabled;
	}
	public void setDisabled(int disabled) {
		this.disabled = disabled;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHomeBase() {
		return homeBase;
	}
	public void setHomeBase(String homeBase) {
		this.homeBase = homeBase;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public int getLandmark1() {
		return landmark1;
	}
	public void setLandmark1 (int landmark1) {
		this.landmark1 = landmark1;
	}
	public int getLandmark2() {
		return landmark2;
	}
	public void setLandmark2 (int landmark2) {
		this.landmark2 = landmark2;
	}
	public int getLandmark3() {
		return landmark3;
	}
	public void setLandmark3 (int landmark3) {
		this.landmark3 = landmark3;
	}
	public int getLandmark4() {
		return landmark4;
	}
	public void setLandmark4 (int landmark4) {
		this.landmark4 = landmark4;
	}
	public int getLandmark5() {
		return landmark5;
	}
	public void setLandmark5 (int landmark5) {
		this.landmark5 = landmark5;
	}
	public int getLandmark6() {
		return landmark6;
	}
	public void setLandmark6 (int landmark6) {
		this.landmark6 = landmark6;
	}
	public int getLandmark7() {
		return landmark7;
	}
	public void setLandmark7 (int landmark7) {
		this.landmark7 = landmark7;
	}

	
}















