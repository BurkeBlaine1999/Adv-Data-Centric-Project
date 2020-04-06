package com.lab3.q1;

public class Person {
	
	private String firstName;
	private String surname;
	private Address address;

	public Person(String firstName, String surname, Address address) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", surname=" + surname + ", address=" + address + "]";
	}
	
}
