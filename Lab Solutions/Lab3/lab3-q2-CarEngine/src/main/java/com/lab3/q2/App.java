package com.lab3.q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lab3/q2/beans/beans.xml");
		
		Car car2017G1 = (Car) context.getBean("2017-G-1");
		Car car2000G456 = (Car) context.getBean("2000-G-456");
		Car car2010WH77 = (Car) context.getBean("2010-WH-77");
		
		System.out.println(car2017G1.toString());
		System.out.println(car2000G456.toString());
		System.out.println(car2010WH77.toString());
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
