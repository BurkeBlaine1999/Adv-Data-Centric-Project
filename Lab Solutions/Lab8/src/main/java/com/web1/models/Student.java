package com.web1.models;

public class Student {
	
	String name;
	
	public Student() {
		super();
		System.out.println("Student Constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
