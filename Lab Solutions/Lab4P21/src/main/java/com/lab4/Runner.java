package com.lab4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/lab4/beans/beans.xml");
		Person person = (Person) context.getBean("person1");
		System.out.println(person);
	}

}
