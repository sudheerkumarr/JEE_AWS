package com.example.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	// Fields
	private long id;
	private String city;
	private String state;
	
	// Constructors
	public Address() {}
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
	public Address(long id, String city, String state) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
	}
	// Getters & Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
