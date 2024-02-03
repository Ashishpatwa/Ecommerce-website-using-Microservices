package com.ecommerce.Inventorymanagementservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Inventorymanagementservice.models.Product;

@RestController
@RequestMapping("/api/catalog")
public class Inventory {
	
	
	@RequestMapping("/productAvability/{productId}")
	public boolean getProductAvability(@PathVariable("productId") String productId) {
		return true;
	}
	
	
	@RequestMapping("/variantAvability/{variantId}")
	public boolean getVariantAvability(@PathVariable("variantId") String variantId) {
		return true;
	}
	
	@RequestMapping("/getProduct/{productId}")
	public Product getProductItem(@PathVariable("productId") String productId){
		
		return new Product("ProdId100", "SmartPhone", 18000.0d, 16000.0d, "Realme", 4.7d, "No1 brand", 30.0d, "Skus100", "SellId1001", "CategId1001", 10, true);
		
	
	}

}
