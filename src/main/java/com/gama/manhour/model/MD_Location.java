package com.gama.manhour.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MD_Location {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long locationId;
	private String location;
	
	
	public MD_Location() {

	}
	
	public MD_Location(long locationId, String location) {
		super();
		this.locationId = locationId;
		this.location = location;
	}
	
	
	public long getLocationId() {
		return locationId;
	}
	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	
	
}
