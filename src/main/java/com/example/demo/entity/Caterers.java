package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Caterers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id;
	private String name;
	@Column(nullable=false , unique=true)
	private String caterersCode;
	private Long pricePerVegPlate;
	private Long pricePerNonVegPlate;
	
	public Caterers() {}

	public Caterers(Long id, String name, String caterersCode, Long pricePerVegPlate, Long pricePerNonVegPlate) {
		super();
		this.id = id;
		this.name = name;
		this.caterersCode = caterersCode;
		this.pricePerVegPlate = pricePerVegPlate;
		this.pricePerNonVegPlate = pricePerNonVegPlate;
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

	public String getCaterersCode() {
		return caterersCode;
	}

	public void setCaterersCode(String caterersCode) {
		this.caterersCode = caterersCode;
	}

	public Long getPricePerVegPlate() {
		return pricePerVegPlate;
	}

	public void setPricePerVegPlate(Long pricePerVegPlate) {
		this.pricePerVegPlate = pricePerVegPlate;
	}

	public Long getPricePerNonVegPlate() {
		return pricePerNonVegPlate;
	}

	public void setPricePerNonVegPlate(Long pricePerNonVegPlate) {
		this.pricePerNonVegPlate = pricePerNonVegPlate;
	}

	@Override
	public String toString() {
		return "Caterers [id=" + id + ", name=" + name + ", caterersCode=" + caterersCode + ", pricePerVegPlate="
				+ pricePerVegPlate + ", pricePerNonVegPlate=" + pricePerNonVegPlate + "]";
	}
	
	
	
	

}
