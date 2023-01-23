package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class Event {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id;
	private String eventType;
    private Date eventStartDate;
    private Date eventEndDate;
    
//    @OneToOne(cascade=CascadeType.ALL , fetch = FetchType.EAGER)
//    private Locations locations;
//    
//    @OneToOne(cascade=CascadeType.ALL , fetch = FetchType.EAGER)
//    private Users users;
//    
//    @OneToOne(cascade=CascadeType.ALL , fetch = FetchType.EAGER)
//    private Decorators decorators;
//    
//    @OneToOne(cascade=CascadeType.ALL , fetch = FetchType.EAGER)
//    private Caterers caterers;

	public Event() {}

	public Event(Long id, String eventType, Date eventStartDate, Date eventEndDate /*, Locations locations, Users users,
			Decorators decorators, Caterers caterers*/) {
		super();
		this.id = id;
		this.eventType = eventType;
		this.eventStartDate = eventStartDate;
		this.eventEndDate = eventEndDate;
//		this.locations = locations;
//		this.users = users;
//		this.decorators = decorators;
//		this.caterers = caterers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public Date getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(Date eventStartDate) {
		this.eventStartDate = eventStartDate;
	}

	public Date getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(Date eventEndDate) {
		this.eventEndDate = eventEndDate;
	}

//	public Locations getLocations() {
//		return locations;
//	}
//
//	public void setLocations(Locations locations) {
//		this.locations = locations;
//	}
//
//	public Users getUsers() {
//		return users;
//	}
//
//	public void setUsers(Users users) {
//		this.users = users;
//	}
//
//	public Decorators getDecorators() {
//		return decorators;
//	}
//
//	public void setDecorators(Decorators decorators) {
//		this.decorators = decorators;
//	}
//
//	public Caterers getCaterers() {
//		return caterers;
//	}
//
//	public void setCaterers(Caterers caterers) {
//		this.caterers = caterers;
//	}
//	
	
    
    
    
    
    
}
