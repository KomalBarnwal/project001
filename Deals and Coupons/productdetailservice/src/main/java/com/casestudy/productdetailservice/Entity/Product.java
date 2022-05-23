package com.casestudy.productdetailservice.Entity;

import java.math.BigInteger;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	
//	@Transient
//	public static final String SEQUENCE_SAVE = "product_sequence";
//	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull
	public String productId;
	
	@NotNull
	@NotBlank
	public String companyName;
	
	@NotNull
	@NotBlank
	public String offerType;
	
	@NotNull
	@NotBlank
	public String desc;    //it will have a link which will redirect to company's website
	
	@NotNull
	@NotBlank
	public String imageURL;
	
	@NotNull
	@NotBlank
	public String validity;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productId, String companyName, String offerType, String desc, String imageURL, String validity) {
		super();
		this.productId = productId;
		this.companyName = companyName;
		this.offerType = offerType;
		this.desc = desc;
		this.imageURL = imageURL;
		this.validity = validity;
	}

	public String getproductId() {
		return productId;
	}

	public void setproductId(String productId) {
		this.productId = productId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOfferType() {
		return offerType;
	}

	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

//	public static String getSequenceSave() {
//		return SEQUENCE_SAVE;
//	}
					
}
