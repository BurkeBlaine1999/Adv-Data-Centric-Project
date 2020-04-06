package com.lab4;

public class Car {
	
	String reg;
	double engineSize;

	public Car(String reg, double engineSize) {
		super();
		this.reg = reg;
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		return "Car [reg=" + reg + ", engineSize=" + engineSize + "]";
	}

	
}
