package com.sales.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.models.Customer;
import com.sales.models.Product;
import com.sales.repositories.ProductInterface;

@Service
public class ProductService {
	
	@Autowired
	ProductInterface pi;
	
	public void save(Product c)
	{
		pi.save(c);
	}

	public ArrayList<Product> getAllProducts() {
		return (ArrayList<Product>) pi.findAll();
	}
}
