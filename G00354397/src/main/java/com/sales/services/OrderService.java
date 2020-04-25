package com.sales.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.models.Order;
import com.sales.repositories.OrderInterface;

@Service
public class OrderService {
	
	@Autowired
	OrderInterface oi;
	
	public void saveCourse(Order c)
	{
		oi.save(c);
	}
	
	public ArrayList<Order> getAllOrders() {
		return (ArrayList<Order>) oi.findAll();
	}

}
