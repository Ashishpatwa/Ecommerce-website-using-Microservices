package com.ecommerce.Notificationmanagementservice.model;

public class Notification {
	
	
	private String notificationId;
	private String subscriptionId;
	private String orderId;
	private String promotionalId;
	private String customerId;
	private String message;
	private String createdDate;
	
	
	
	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Notification(String notificationId, String subscriptionId, String orderId, String promotionalId,
			String customerId, String message, String createdDate) {
		super();
		this.notificationId = notificationId;
		this.subscriptionId = subscriptionId;
		this.orderId = orderId;
		this.promotionalId = promotionalId;
		this.customerId = customerId;
		this.message = message;
		this.createdDate = createdDate;
	}


	public String getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}
	public String getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getPromotionalId() {
		return promotionalId;
	}
	public void setPromotionalId(String promotionalId) {
		this.promotionalId = promotionalId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	
	

}
