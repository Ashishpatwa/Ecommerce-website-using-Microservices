package com.example.customerService.model;

public class Customer {
	
	private String customerId;
	private String customerName;
	private String gmail;
	private String password;
	private Long phnNo;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerId, String customerName, String gmail, String password, Long phnNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.gmail = gmail;
		this.password = password;
		this.phnNo = phnNo;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
