package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Caterers;
import com.example.demo.repository.CaterersRepository;
@Service
public class CaterersServiceImpl implements CaterersService {
	
	@Autowired
	private CaterersRepository catrepo;

	@Override
	public Caterers saveCaterer(Caterers caterer) {
		// TODO Auto-generated method stub
		return catrepo.save(caterer);
	}

	@Override
	public List<Caterers> fetchCaterersList() {
		// TODO Auto-generated method stub
		return catrepo.findAll();
	}

	@Override
	public Caterers fetchCatererById(Long id) {
		// TODO Auto-generated method stub
		return catrepo.findById(id).get();
	}

	@Override
	public void deleteCatererById(Long id) {
		// TODO Auto-generated method stub
		catrepo.deleteById(id);
		
	}

	@Override
	public Caterers updateCaterer(Long id, Caterers caterer) {
		// TODO Auto-generated method stub
		Caterers cat = catrepo.findById(id).get();
		
		if(Objects.nonNull(caterer.getName())&&!"".equalsIgnoreCase(caterer.getName()))
		{
			cat.setName(caterer.getName());
		}
		if(Objects.nonNull(caterer.getCaterersCode())&&!"".equalsIgnoreCase(caterer.getCaterersCode()))
		{
			cat.setCaterersCode(caterer.getCaterersCode());
		}
		if(Objects.nonNull(caterer.getPricePerVegPlate()))
		{
			cat.setPricePerVegPlate(caterer.getPricePerVegPlate());
		}
		if(Objects.nonNull(caterer.getPricePerNonVegPlate()))
		{
			cat.setPricePerNonVegPlate(caterer.getPricePerNonVegPlate());
		}
		
		return catrepo.save(cat);
	}

}
