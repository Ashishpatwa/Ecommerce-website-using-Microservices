package com.example.SellerService.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SellerService.model.Seller;

@RestController
@RequestMapping("/api/seller")
public class SellerController {
	
	
	
		@RequestMapping("/addUser")
		public List<Seller> addCustomer(Seller seller) {
			return Arrays.asList(
					new Seller("sellId1001", "Rishabh", "rishabh.patwa@nagarro.com", "rishabh@123", 7986908765l)
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