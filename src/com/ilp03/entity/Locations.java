package com.ilp03.entity;

public class Locations {

	private String locationId;
	private String locationName;
	private String locationDescription;

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	public Locations(String locationId, String locationName, String locationDescription) {

		this.locationId = locationId;
		this.locationName = locationName;
		this.locationDescription = locationDescription;
	}

}
