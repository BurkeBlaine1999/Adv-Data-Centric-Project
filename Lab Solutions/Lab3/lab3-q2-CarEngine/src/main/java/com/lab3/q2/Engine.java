package com.lab3.q2;

public class Engine {
	private double size;
	private String fuel;

	public Engine(double size, String fuel) {
		super();
		this.size = size;
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Engine [size=" + size + ", fuel=" + fuel + "]";
	}
	
	
}
