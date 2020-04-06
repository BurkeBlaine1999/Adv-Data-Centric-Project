package com.lab3.q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lab3/q2/beans/beans.xml");
		
		Student john = (Student) context.getBean("john");
		Student patrick = (Student) context.getBean("patrick");
		
		System.out.println(john.toString());
		System.out.println(patrick.toString());
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
