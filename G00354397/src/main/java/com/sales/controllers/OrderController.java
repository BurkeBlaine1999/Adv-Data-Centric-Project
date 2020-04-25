package com.sales.controllers;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sales.models.Order;
import com.sales.services.OrderService;

@Controller
@SessionAttributes("order")
public class OrderController {
	@Autowired
	OrderService os;

	  
  @RequestMapping(value = "/addOrder.html", method=RequestMethod.GET)
  public String addOrderGET(Model model ) {

	  Order o = new Order();
	  model.addAttribute("order",o);
    return "addOrder";
  }
  
  @RequestMapping(value = "/addOrder.html", method=RequestMethod.POST)
  public String addOrderPOST(@ModelAttribute("order") Order o ) {
	  
	  os.saveCourse(o);
	  
    return "redirect:OrderAdded.html";
  }
  
  @RequestMapping(value = "/OrderAdded.html", method=RequestMethod.GET)
  public String orderAddedGET(Model m) {
	  
	  ArrayList<Order> orders = os.getAllOrders();
	  m.addAttribute("orders",orders);
	  
    return "ListOrders";
  }
}
