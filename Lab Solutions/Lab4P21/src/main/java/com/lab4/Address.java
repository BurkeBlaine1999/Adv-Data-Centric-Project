package com.lab4;

public class Address {

	String street;
	String town;
	String county;
	
	public Address(String street, String town, String county) {
		super();
		this.street = street;
		this.town = town;
		this.county = county;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", town=" + town + ", county=" + county + "]";
	}

}
