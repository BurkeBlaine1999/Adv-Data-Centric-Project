package com.lab3.q2;

public class Lecturer {
	private String firstName;
	private String surname;
	private String id;
	
	public Lecturer(String firstName, String surname, String id) {
		this.firstName = firstName;
		this.surname = surname;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Lecturer [firstName=" + firstName + ", surname=" + surname + ", id=" + id + "]";
	}

	
	
}
