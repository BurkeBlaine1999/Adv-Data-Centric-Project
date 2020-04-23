package com.sales.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


import com.sales.models.Product;
import com.sales.services.ProductService;

@Controller
@SessionAttributes("product")
public class ProductController {
	@Autowired
	ProductService ps;

	  
  @RequestMapping(value = "/addProduct.html", method=RequestMethod.GET)
  public String addProductGET(Model model ) {

	  Product p = new Product();
	  model.addAttribute("product",p);
    return "addProduct";
  }
  
  @RequestMapping(value = "/addProduct.html", method=RequestMethod.POST)
  public String addProductPOST(@ModelAttribute("product") Product p ) {
	  
	  ps.saveCourse(p);
	  
    return "redirect:productAdded.html";
  }
  
  @RequestMapping(value = "/productAdded.html", method=RequestMethod.GET)
  public String productAddedGET(@ModelAttribute("product") Product p ) {
	  
    return "productDone";
  }
}
