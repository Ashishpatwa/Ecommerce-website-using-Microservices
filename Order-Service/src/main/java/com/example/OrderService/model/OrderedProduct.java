package com.example.OrderService.model;

public class OrderedProduct {
	
	
	private String orderedProductId;
	private String orderId;
	private String productId;
	private Integer quantity;
	
	
	public OrderedProduct() {
		super();
		// TODO Auto-generated constructor stub
	}


	public OrderedProduct(String orderedProductId, String orderId, String productId, Integer quantity) {
		super();
		this.orderedProductId = orderedProductId;
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
	}


	public String getOrderedProductId() {
		return orderedProductId;
	}


	public void setOrderedProductId(String orderedProductId) {
		this.orderedProductId = orderedProductId;
	}


	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
	

}
