package com.example.CardService.model;

public class CardItem {
	
	private String cardId;
	private String productId;
	private String buyerId;
	private Integer quantity;
	
	
	public CardItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public CardItem(String cardId, String productId, String buyerId, Integer quantity) {
		super();
		this.cardId = cardId;
		this.productId = productId;
		this.buyerId = buyerId;
		this.quantity = quantity;
	}


	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	

}
