package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Decorators {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id;
	private String name;
	@Column(nullable=false , unique=true)
	private String decoratorsCode;
	private Long indoorDecor;
	private Long outdoorDecor;
	
	public Decorators() {}

	public Decorators(Long id, String name, String decoratorsCode, Long indoorDecor, Long outdoorDecor) {
		super();
     	this.id = id;
		this.name = name;
		this.decoratorsCode = decoratorsCode;
		this.indoorDecor = indoorDecor;
		this.outdoorDecor = outdoorDecor;
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

	public String getDecoratorsCode() {
		return decoratorsCode;
	}

	public void setDecoratorsCode(String decoratorsCode) {
		this.decoratorsCode = decoratorsCode;
	}

	public Long getIndoorDecor() {
		return indoorDecor;
	}

	public void setIndoorDecor(Long indoorDecor) {
		this.indoorDecor = indoorDecor;
	}

	public Long getOutdoorDecor() {
		return outdoorDecor;
	}

	public void setOutdoorDecor(Long outdoorDecor) {
		this.outdoorDecor = outdoorDecor;
	}

	@Override
	public String toString() {
		return "Decorators [id=" + id + ", name=" + name + ", decoratorsCode=" + decoratorsCode + ", indoorDecor="
				+ indoorDecor + ", outoorDecor=" + outdoorDecor + "]";
	}
	
	
	
	

}
