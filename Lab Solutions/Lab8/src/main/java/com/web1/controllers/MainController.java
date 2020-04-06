package com.web1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web1.models.Student;

@Controller
public class MainController {

  @RequestMapping(value = "/addStudent", method=RequestMethod.GET)
  public String helloWorld(@ModelAttribute("xyz") Student s) {
	  return "addStudent";
  }
  
  @RequestMapping(value = "/addStudent", method=RequestMethod.POST)
  public String helloWorldPOST(@ModelAttribute("xyz") Student s) {
	  return "redirect:endpage.html";
  } 
  
  @RequestMapping(value = "/endpage", method=RequestMethod.GET)
  public String helloWorldEP(@ModelAttribute("xyz") Student s) {
	  return "studentAdded";
  }  
}
