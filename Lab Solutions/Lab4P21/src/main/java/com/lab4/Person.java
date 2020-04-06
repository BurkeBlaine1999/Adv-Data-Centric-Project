package com.lab4;

public class Person {

	String name;
	Address address;
	Car car;
	
	public Person(String name, Address address, Car c) {
		super();
		this.name = name;
		this.address = address;
		this.car = c;
	}

	
	public void setAddress(Address address) {
		System.out.println("In setAddress()");
		this.address = address;
	}

	public void setCar1(Car car) {
		System.out.println("In setCar1()");
		this.car = car;
	}
	
	public void setCar2(Car car) {
		System.out.println("In setCar2()");
		this.car = car;
	}
	
	


	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", car=" + car + "]";
	}

}
