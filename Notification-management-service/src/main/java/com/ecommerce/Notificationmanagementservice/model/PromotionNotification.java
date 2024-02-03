package com.ecommerce.Notificationmanagementservice.model;

public class PromotionNotification {
	
	private String PromotionNotificationId;
	private String promotionId;
	private String notificationId;
	
	
	public PromotionNotification() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PromotionNotification(String promotionNotificationId, String promotionId, String notificationId) {
		super();
		PromotionNotificationId = promotionNotificationId;
		this.promotionId = promotionId;
		this.notificationId = notificationId;
	}


	public String getPromotionNotificationId() {
		return PromotionNotificationId;
	}


	public void setPromotionNotificationId(String promotionNotificationId) {
		PromotionNotificationId = promotionNotificationId;
	}


	public String getPromotionId() {
		return promotionId;
	}


	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}


	public String getNotificationId() {
		return notificationId;
	}


	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}
	
	
	
	
}
