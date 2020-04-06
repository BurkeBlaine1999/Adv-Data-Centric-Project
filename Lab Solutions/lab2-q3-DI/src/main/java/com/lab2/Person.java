package com.lab2;

public class Person {
	
	private String firstName;
	private String lastName;
	
	public Person() {
		this.firstName = "No first Name";
		this.lastName = "No Surname";
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}

