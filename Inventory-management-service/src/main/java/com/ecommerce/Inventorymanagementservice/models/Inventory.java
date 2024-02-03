package com.ecommerce.Inventorymanagementservice.models;

public class Inventory {
	
	private Integer inventoryId;
	private Integer sellerId;
	private Integer quantity;
	private String modifiedDate;
	private String createdDate;
	
	
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Inventory(Integer inventoryId, Integer sellerId, Integer quantity, String modifiedDate, String createdDate) {
		super();
		this.inventoryId = inventoryId;
		this.sellerId = sellerId;
		this.quantity = quantity;
		this.modifiedDate = modifiedDate;
		this.createdDate = createdDate;
	}

	
	public Integer getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	
	

}
