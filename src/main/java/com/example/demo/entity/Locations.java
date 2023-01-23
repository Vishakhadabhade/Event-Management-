package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Locations {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id;
	private String name;
	@Column(nullable=false , unique=true)
	private String locationCode;
	private String state;
	private Long perDayRent;
	
	public Locations() {}

	public Locations(Long id, String name, String locationCode, String state, Long perDayRent) {
		super();
		this.id = id;
		this.name = name;
		this.locationCode = locationCode;
		this.state = state;
		this.perDayRent = perDayRent;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPerDayRent() {
		return perDayRent;
	}

	public void setPerDayRent(Long perDayRent) {
		this.perDayRent = perDayRent;
	}

	@Override
	public String toString() {
		return "Locations [id=" + id + ", name=" + name + ", locationCode=" + locationCode + ", state=" + state
				+ ", perDayRent=" + perDayRent + "]";
	}
	
	
	
	

}
