package com.sales.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sales.models.Customer;
import com.sales.models.Order;
import com.sales.services.CustomerService;

@Controller
@SessionAttributes("customer")
public class CustomerController {
	@Autowired
	CustomerService cs;

	  
  @RequestMapping(value = "/addCustomer.html", method=RequestMethod.GET)
  public String addCustomerGET(Model model ) {

	  Customer c = new Customer();
	  model.addAttribute("customer",c);
    return "addCustomer";
  }
  
  
  @RequestMapping(value = "/addCustomer.html", method=RequestMethod.POST)
  public String addCustomerPOST(@ModelAttribute("customer") Customer c ) {
	  
	  cs.saveCourse(c);
	  
    return "redirect:customerAdded.html";
  }
  
  
  @RequestMapping(value = "/customerAdded.html", method=RequestMethod.GET)
  public String orderAddedGET(Model m) {
	  
	  ArrayList<Customer> customers = cs.getAll();
	  m.addAttribute("customers",customers);
	  
    return "ListCustomers";
  }
  
}
