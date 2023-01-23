package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Locations;
import com.example.demo.repository.LocationsRepository;
@Service
public class LocationsServiceImpl implements LocationsService {
	
	@Autowired
	private LocationsRepository locrepo;

	@Override
	public Locations saveLocation(Locations location) {
		// TODO Auto-generated method stub
		return locrepo.save(location);
	}

	@Override
	public List<Locations> fetchLocationList() {
		// TODO Auto-generated method stub
		return locrepo.findAll();
	}

	@Override
	public Locations fetchLocationById(Long id) {
		// TODO Auto-generated method stub
		return locrepo.findById(id).get();
	}

	@Override
	public void deleteLocationById(Long id) {
		// TODO Auto-generated method stub
		locrepo.deleteById(id);
		
	}

	@Override
	public Locations updateLocation(Long id, Locations location) {
		// TODO Auto-generated method stub
		Locations loc= locrepo.findById(id).get();
		
		if(Objects.nonNull(location.getName())&&!"".equalsIgnoreCase(location.getName()))
		{
			loc.setName(location.getName());
		}
		
		if(Objects.nonNull(location.getLocationCode())&&!"".equalsIgnoreCase(location.getLocationCode()))
		{
			loc.setLocationCode(location.getLocationCode());
		}
		
		if(Objects.nonNull(location.getState())&&!"".equalsIgnoreCase(location.getState()))
		{
			loc.setState(location.getState());
		}
		
		if(Objects.nonNull(location.getPerDayRent()))
		{
			loc.setPerDayRent(location.getPerDayRent());
		}
		return locrepo.save(loc);
	}
	
	
	

}
