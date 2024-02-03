package com.ecommerce.Notificationmanagementservice.model;

public class SubscriptionNotification {
	
	private String subscriptionNotificationId;
	private String subscriptionId;
	private String notificationId;
	
	
	public SubscriptionNotification() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SubscriptionNotification(String subscriptionNotificationId, String subscriptionId, String notificationId) {
		super();
		this.subscriptionNotificationId = subscriptionNotificationId;
		this.subscriptionId = subscriptionId;
		this.notificationId = notificationId;
	}


	public String getSubscriptionNotificationId() {
		return subscriptionNotificationId;
	}


	public void setSubscriptionNotificationId(String subscriptionNotificationId) {
		this.subscriptionNotificationId = subscriptionNotificationId;
	}


	public String getSubscriptionId() {
		return subscriptionId;
	}


	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}


	public String getNotificationId() {
		return notificationId;
	}


	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}

	
	
	
	
	
	
}
