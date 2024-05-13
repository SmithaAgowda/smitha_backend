package com.spring.spring.constructor;

public class Address {


	public Address(int id, String place) {
		super();
		this.id = id;
		this.place = place;
	}
	private int id;
	private String place;
	
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", place=" + place + "]";
	}
	
}