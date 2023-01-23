package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Decorators;
import com.example.demo.repository.DecoratorsRepository;
@Service
public class DecoratorsServiceImpl implements DecoratorsService {
	
	@Autowired
	private DecoratorsRepository decrepo;

	@Override
	public Decorators saveDecorator(Decorators decorator) {
		// TODO Auto-generated method stub
		return decrepo.save(decorator);
	}

	@Override
	public List<Decorators> fetchDecoratorList() {
		// TODO Auto-generated method stub
		return decrepo.findAll();
	}

	@Override
	public Decorators fetchDecoratorById(Long id) {
		// TODO Auto-generated method stub
		return decrepo.findById(id).get();
	}

	@Override
	public void deleteDecoratorById(Long id) {
		// TODO Auto-generated method stub
		decrepo.deleteById(id);
		
	}

	@Override
	public Decorators updateDecorator(Long id, Decorators decorator) {
		// TODO Auto-generated method stub
		Decorators dec = decrepo.findById(id).get();
		
		if(Objects.nonNull(decorator.getName())&&!"".equalsIgnoreCase(decorator.getName()))
		{
			dec.setName(decorator.getName());
		}
		if(Objects.nonNull(decorator.getDecoratorsCode())&&!"".equalsIgnoreCase(decorator.getDecoratorsCode()))
		{
			dec.setDecoratorsCode(decorator.getDecoratorsCode());
		}
		if(Objects.nonNull(decorator.getIndoorDecor()))
		{
			dec.setIndoorDecor(decorator.getIndoorDecor());
		}
		if(Objects.nonNull(decorator.getOutdoorDecor()))
		{
			dec.setOutdoorDecor(decorator.getOutdoorDecor());
		}
		return decrepo.save(dec);
	}

}
