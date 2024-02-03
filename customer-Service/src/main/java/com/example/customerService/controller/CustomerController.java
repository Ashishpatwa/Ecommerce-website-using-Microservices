package com.example.customerService.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerService.model.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	
	@RequestMapping("/addUser")
	public List<Customer> addCustomer(Customer customer) {
		return Arrays.asList(
				new Customer("CusId1001", "Ashish", "ashish.patwa@nagarro.com", "ashish@123", 6307908765l)
				);
	}
	
	
	@RequestMapping("/addSubcription/{productId}")
	public boolean setSubscription(@PathVariable("productId") String productId) {
		return true;
	}
	
	@RequestMapping("/removeSubcription/{productId}")
	public boolean unsetSubscription(@PathVariable("productId") String productId) {
		return true;
	}

}
