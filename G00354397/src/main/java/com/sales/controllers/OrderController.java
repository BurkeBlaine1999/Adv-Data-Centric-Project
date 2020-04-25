package com.sales.controllers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sales.models.Customer;
import com.sales.models.Order;
import com.sales.models.Product;
import com.sales.services.CustomerService;
import com.sales.services.OrderService;
import com.sales.services.ProductService;

@Controller
@SessionAttributes("order")
public class OrderController {
	@Autowired
	OrderService os;

	@Autowired
	CustomerService cs;
	
	@Autowired
	ProductService ps;

	@RequestMapping(value = "/ListOrders.html", method = RequestMethod.GET)
	public String addOrderGET(Model model) {

		ArrayList<Order> o = os.getAllOrders();
		model.addAttribute("orders", o);
		return "ListOrders";
	}

	@RequestMapping(value = "/addOrder.html", method = RequestMethod.POST)
	public String addOrderPOST(@ModelAttribute("order") Order o) {

		os.saveCourse(o);

		return "redirect:ListOrders.html";
	}

	@RequestMapping(value = "/addOrder.html", method = RequestMethod.GET)
	public String orderAddedGET(Model m) {

		Order order = new Order();

		ArrayList<Customer> customers = cs.getAll();
		Map<Long, String> customersList = new LinkedHashMap<Long, String>();
		
		ArrayList<Product> products = ps.getAllProducts();
		Map<Long, String> productsList = new LinkedHashMap<Long, String>();

		for (Customer c : customers) {
			customersList.put(c.getcId(), c.getcName());
		}
		
		for (Product p : products) {
			productsList.put(p.getpId(),p.getpDesc());
		}

		m.addAttribute("customersList", customersList);
		m.addAttribute("productsList", productsList);
		m.addAttribute("order", order);

		return "addOrder";
	}
}
