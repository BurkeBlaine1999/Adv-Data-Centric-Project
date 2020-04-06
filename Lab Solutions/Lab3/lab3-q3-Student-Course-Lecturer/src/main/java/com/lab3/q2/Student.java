package com.lab3.q2;

public class Student {
	
	private String firstName;
	private String surname;
	private Course course;

	public Student(String firstName, String surname, Course course) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", surname=" + surname + ", course=" + course + "]";
	}

}
