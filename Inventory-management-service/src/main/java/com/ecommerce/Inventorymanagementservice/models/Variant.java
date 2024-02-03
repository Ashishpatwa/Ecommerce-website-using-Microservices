package com.ecommerce.Inventorymanagementservice.models;

public class Variant {
	
	private Integer variantId;
	private Integer productId;
	private String variantName;
	private String colorType;
	private String sizeType;
	private boolean variantAvability;
	
	
	
	public Variant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Variant(Integer variantId, Integer productId, String variantName, String colorType, String sizeType,
			boolean variantAvability) {
		super();
		this.variantId = variantId;
		this.productId = productId;
		this.variantName = variantName;
		this.colorType = colorType;
		this.sizeType = sizeType;
		this.variantAvability = variantAvability;
	}
	
	
	public Integer getVariantId() {
		return variantId;
	}
	public void setVariantId(Integer variantId) {
		this.variantId = variantId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getVariantName() {
		return variantName;
	}
	public void setVariantName(String variantName) {
		this.variantName = variantName;
	}
	public String getColorType() {
		return colorType;
	}
	public void setColorType(String colorType) {
		this.colorType = colorType;
	}
	public String getSizeType() {
		return sizeType;
	}
	public void setSizeType(String sizeType) {
		this.sizeType = sizeType;
	}
	public boolean isVariantAvability() {
		return variantAvability;
	}
	public void setVariantAvability(boolean variantAvability) {
		this.variantAvability = variantAvability;
	}
	
	
	
	
}
