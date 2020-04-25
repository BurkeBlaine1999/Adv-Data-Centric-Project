package com.sales.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.models.Customer;
import com.sales.models.Order;
import com.sales.repositories.CustomerInterface;

@Service
public class CustomerService {
	
	@Autowired
	CustomerInterface ci;
	
	public void saveCourse(Customer c)
	{
		ci.save(c);
	}

	public ArrayList<Customer> getAll() {
		return (ArrayList<Customer>) ci.findAll();
	}
}
