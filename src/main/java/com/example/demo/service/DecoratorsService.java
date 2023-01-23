package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Decorators;

public interface DecoratorsService {

	
	public Decorators saveDecorator (Decorators decorator);
	public List<Decorators>fetchDecoratorList();
	public Decorators fetchDecoratorById(Long id);
	public void deleteDecoratorById(Long id);
	public Decorators updateDecorator(Long id , Decorators decorator);
}
