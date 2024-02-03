package com.ecommerce.Inventorymanagementservice.models;

public class Category {
	
	private Integer categoryId;
	private String categoryName;
	private String categoryDescription;
	private Integer noOfProducts;
	
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(Integer categoryId, String categoryName, String categoryDescription, Integer noOfProducts) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.noOfProducts = noOfProducts;
	}
	
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public Integer getNoOfProducts() {
		return noOfProducts;
	}
	public void setNoOfProducts(Integer noOfProducts) {
		this.noOfProducts = noOfProducts;
	}
	
	
	
	
	
	
	

}
