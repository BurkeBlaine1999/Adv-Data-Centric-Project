package com.lab3.q4.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lab3/q4/beanScope/beans/beans.xml");
		
		Employee john = (Employee) context.getBean("employee");
		john.setName("John");
		john.setSalary(30500.99);


		Employee tom = (Employee) context.getBean("employee");
		tom.setName("tom");
		tom.setSalary(35122.01);

		System.out.println(john.toString());
		System.out.println(tom.toString());
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
