package com.ecommerce.Inventorymanagementservice.models;

public class Images {
	
	private Integer imageId;
	private Integer variantId;
	private String image;
	
	
	public Images() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Images(Integer imageId, Integer variantId, String image) {
		super();
		this.imageId = imageId;
		this.variantId = variantId;
		this.image = image;
	}


	public Integer getImageId() {
		return imageId;
	}
	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}
	public Integer getVariantId() {
		return variantId;
	}
	public void setVariantId(Integer variantId) {
		this.variantId = variantId;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	

}
