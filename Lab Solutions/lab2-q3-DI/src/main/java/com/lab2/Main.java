package com.lab2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
		
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lab2/beans/beans.xml");
		Person person = (Person) context.getBean("personBean");
		System.out.println(person.toString());
	}
}
