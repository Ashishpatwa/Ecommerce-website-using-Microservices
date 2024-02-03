package com.example.SubscriptionService.model;

public class Subscription {
	

	private String subscriptionId;
	private String productCategory;
	private String subscriptionStatus;
	private String customerId;
	private String productId;
	
	
	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Subscription(String subscriptionId, String productCategory, String subscriptionStatus, String customerId,
			String productId) {
		super();
		this.subscriptionId = subscriptionId;
		this.productCategory = productCategory;
		this.subscriptionStatus = subscriptionStatus;
		this.customerId = customerId;
		this.productId = productId;
	}


	public String getSubscriptionId() {
		return subscriptionId;
	}


	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}


	public String getProductCategory() {
		return productCategory;
	}


	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}


	public String getSubscriptionStatus() {
		return subscriptionStatus;
	}


	public void setSubscriptionStatus(String subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	
	

}
