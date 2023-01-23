package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Locations;

public interface LocationsService {
	
	
	public Locations saveLocation (Locations location);
	public List<Locations>fetchLocationList();
	public Locations fetchLocationById(Long id);
	public void deleteLocationById(Long id);
	public Locations updateLocation(Long id , Locations location);

}
