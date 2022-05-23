package com.casestudy.addToCart.Entity;

import java.math.BigInteger;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
//import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull
	public String id;
	public int productId;
		
	public Cart() {
		super();
	}

	public Cart(String id, int productId) {
		super();
		this.id = id;
		this.productId = productId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

		
}
