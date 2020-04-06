package com.lab3.q1;

public class Address {
	private String street;
	private String town;
	private String county;

	public Address(String street, String town, String county) {
		this.street = street;
		this.town = town;
		this.county = county;
	}

	
	@Override
	public String toString() {
		return "Address [street=" + street + ", town=" + town + ", county=" + county + "]";
	}
	
	
}
