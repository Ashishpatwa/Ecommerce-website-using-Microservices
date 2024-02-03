package com.example.CardService.model;

public class Product {
	
	
	private String productId;
	private String productName;
	private double originalPrice;
	private double finalPrice;
	private String brandName;
	private double rating;
	private String productDescription;
	private double discountPercentage;
	private String skusNumber;
	private String sellerId;
	private String categoryId;
	private boolean availability;
	private Integer quantity;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(String productId, String productName, double originalPrice, double finalPrice, String brandName,
			double rating, String productDescription, double discountPercentage, String skusNumber, String sellerId,
			String categoryId, Integer quantity, boolean availability) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.originalPrice = originalPrice;
		this.finalPrice = finalPrice;
		this.brandName = brandName;
		this.rating = rating;
		this.productDescription = productDescription;
		this.discountPercentage = discountPercentage;
		this.skusNumber = skusNumber;
		this.sellerId = sellerId;
		this.categoryId = categoryId;
		this.quantity = quantity;
		this.availability = availability;
	}










	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}






	public boolean isAvailability() {
		return availability;
	}
	
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getOriginalPrice() {
		return originalPrice;
	}


	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}


	public double getFinalPrice() {
		return finalPrice;
	}


	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public double getDiscountPercentage() {
		return discountPercentage;
	}


	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}


	public String getSkusNumber() {
		return skusNumber;
	}


	public void setSkusNumber(String skusNumber) {
		this.skusNumber = skusNumber;
	}


	public String getSellerId() {
		return sellerId;
	}


	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}


	public String getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	
	
	
	
	

}
