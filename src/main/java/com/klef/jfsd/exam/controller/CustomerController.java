package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.service.CustomerService;

@Controller
public class CustomerController 
{
	@Autowired
	CustomerService service;
	
	@GetMapping("/")
	@ResponseBody
	public String home()
	{
		return "This is Home page";
	}
	
	@GetMapping("viewallcustomers")
	@ResponseBody
	public List<Customer> viewall()
	{
		return  service.viewallcustomers();
	}
}
