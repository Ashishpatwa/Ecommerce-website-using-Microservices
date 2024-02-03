package com.example.PromotionService.model;

public class Promotion {
	
	
	private String promotionId;
	private String promotionTitle;
	private String promotionDescription;
	private String startDate;
	private String endDate;
	private String productId;
	
	
	public Promotion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Promotion(String promotionId, String promotionTitle, String promotionDescription, String startDate,
			String endDate, String productId) {
		super();
		this.promotionId = promotionId;
		this.promotionTitle = promotionTitle;
		this.promotionDescription = promotionDescription;
		this.startDate = startDate;
		this.endDate = endDate;
		this.productId = productId;
	}


	public String getPromotionId() {
		return promotionId;
	}


	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}


	public String getPromotionTitle() {
		return promotionTitle;
	}


	public void setPromotionTitle(String promotionTitle) {
		this.promotionTitle = promotionTitle;
	}


	public String getPromotionDescription() {
		return promotionDescription;
	}


	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}
	

}
