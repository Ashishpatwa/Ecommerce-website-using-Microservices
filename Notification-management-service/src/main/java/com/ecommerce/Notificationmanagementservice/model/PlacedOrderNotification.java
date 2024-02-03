package com.ecommerce.Notificationmanagementservice.model;

public class PlacedOrderNotification {
	
	private String placedOrderNotification;
	private String notificationId;
	private String orderId;
	
	
	public PlacedOrderNotification() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PlacedOrderNotification(String placedOrderNotification, String notificationId, String orderId) {
		super();
		this.placedOrderNotification = placedOrderNotification;
		this.notificationId = notificationId;
		this.orderId = orderId;
	}


	public String getPlacedOrderNotification() {
		return placedOrderNotification;
	}
	public void setPlacedOrderNotification(String placedOrderNotification) {
		this.placedOrderNotification = placedOrderNotification;
	}
	public String getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	
	
	
	

}
