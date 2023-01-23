package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Event;
import com.example.demo.repository.EventRepository;
@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	private EventRepository everepo;

	@Override
	public Event saveEvent(Event event) {
		// TODO Auto-generated method stub
		return everepo.save(event);
	}

	@Override
	public List<Event> fetchEventList() {
		// TODO Auto-generated method stub
		return everepo.findAll();
	}

	@Override
	public Event fetchEventById(Long id) {
		// TODO Auto-generated method stub
		return everepo.findById(id).get();
	}

	@Override
	public void deleteEventById(Long id) {
		// TODO Auto-generated method stub
		everepo.deleteById(id);
		
	}

	@Override
	public Event updateEvent(Long id, Event event) {
		// TODO Auto-generated method stub
		Event eve = everepo.findById(id).get();
		if(Objects.nonNull(event.getEventType())&&!"".equalsIgnoreCase(event.getEventType()))
		{
			eve.setEventType(event.getEventType());
		}
		
		return everepo.save(eve);
	}

}
