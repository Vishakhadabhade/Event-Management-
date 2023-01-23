package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Caterers;

public interface CaterersService {

	
	public Caterers saveCaterer (Caterers caterer);
	public List<Caterers>fetchCaterersList();
	public Caterers fetchCatererById(Long id);
	public void deleteCatererById(Long id);
	public Caterers updateCaterer(Long id , Caterers caterer);
}
