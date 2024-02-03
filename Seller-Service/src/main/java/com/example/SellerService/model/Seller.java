package com.example.SellerService.model;

public class Seller {
	
	
	private String sellerId;
	private String sellerName;
	private String gmail;
	private String password;
	private Long phnNo;
	
	
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Seller(String sellerId, String sellerName, String gmail, String password, Long phnNo) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.gmail = gmail;
		this.password = password;
		this.phnNo = phnNo;
	}


	public String getSellerId() {
		return sellerId;
	}


	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}


	public String getSellerName() {
		return sellerName;
	}


	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public String getGmail() {
		return gmail;
	}


	public void setGmail(String gmail) {
		this.gmail = gmail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Long getPhnNo() {
		return phnNo;
	}


	public void setPhnNo(Long phnNo) {
		this.phnNo = phnNo;
	}
	
	
	
	
	
}
