package com.example.CardService.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.CardService.model.CardItem;
import com.example.CardService.model.Product;

import reactor.netty.http.client.HttpClient;
import reactor.netty.http.server.HttpServer;

@RestController
@RequestMapping("/api/card")
public class Card {
	
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	
	@RequestMapping("/addOn/{productId}/{quantity}")
	public ResponseEntity<?> addItemOnCard(@PathVariable("productId") String productId, @PathVariable("quantity") Integer quantity) {
	
		
		//call product service to get product details.
		Product product = webClientBuilder.build()
								.get()
								.uri("http://localhost:8081/api/catalog/getProduct/"+ productId)
								.retrieve()
								.bodyToMono(Product.class)
								.block();
		
		//check product Avaliability and product quantity
		if(product.isAvailability() != true || product.getQuantity() < quantity) {
			
			String result = "Product out of Stock";
			return ResponseEntity.ok("{\"message\": \""+ result + "\"}");
		
			
		}
		
		
		CardItem cardItem = new CardItem();
		cardItem.setProductId(product.getProductId());
		cardItem.setCardId("1");
		cardItem.setBuyerId(product.getSellerId());
		cardItem.setQuantity(quantity);
		
		return new ResponseEntity<>(cardItem, HttpStatus.OK);
		
		
	}
	
	
	
	
	@RequestMapping("/removeItem/{productId}")
	public ResponseEntity<String> removeItem(@PathVariable("productId") String productId){
		
		String result = "Successfully Removed";
		return ResponseEntity.ok("{\"message\": \""+ result +"\"}");
		
	 }
	
}
