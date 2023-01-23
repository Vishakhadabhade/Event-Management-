package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Event;

public interface EventService {
	
	
	public Event saveEvent (Event event);
	public List<Event>fetchEventList();
	public Event fetchEventById(Long id);
	public void deleteEventById(Long id);
	public Event updateEvent(Long id , Event event);

}
