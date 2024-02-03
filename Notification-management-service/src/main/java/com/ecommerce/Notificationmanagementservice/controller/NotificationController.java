package com.ecommerce.Notificationmanagementservice.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Notificationmanagementservice.model.PlacedOrderNotification;
import com.ecommerce.Notificationmanagementservice.model.PromotionNotification;
import com.ecommerce.Notificationmanagementservice.model.SubscriptionNotification;

@RestController
@RequestMapping("/api")
public class NotificationController {
	
	@RequestMapping("/OrderedNotification")
	public List<PlacedOrderNotification> getPlacedOrderNotification(String notificationId){
		return Arrays.asList(
				new PlacedOrderNotification()
				);
	}
	
	@RequestMapping("/promotionNotification")
	public List<PromotionNotification> getPromotionNotification(String notificationId){
		return Arrays.asList(
				new PromotionNotification()
				);
	}
	
	
	@RequestMapping("/subscriptionNotification")
	public List<SubscriptionNotification> getSubscriptionNotification(String notificationId){
		return Arrays.asList(
				new SubscriptionNotification()
				);
	}
	
	
	
}
