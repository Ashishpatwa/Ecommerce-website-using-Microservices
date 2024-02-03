package com.example.OrderService.model;

public class Order {
	
	
	private String orderId;
	private String BuyerId;
	private String orderDate;
	private String deliveryStatus;
	private String sellerApproval;
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Order(String orderId, String buyerId, String orderDate, String deliveryStatus, String sellerApproval) {
		super();
		this.orderId = orderId;
		BuyerId = buyerId;
		this.orderDate = orderDate;
		this.deliveryStatus = deliveryStatus;
		this.sellerApproval = sellerApproval;
	}


	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public String getBuyerId() {
		return BuyerId;
	}


	public void setBuyerId(String buyerId) {
		BuyerId = buyerId;
	}


	public String getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}


	public String getDeliveryStatus() {
		return deliveryStatus;
	}


	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}


	public String getSellerApproval() {
		return sellerApproval;
	}


	public void setSellerApproval(String sellerApproval) {
		this.sellerApproval = sellerApproval;
	}
	

}
