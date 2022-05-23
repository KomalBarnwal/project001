package com.casestudy.addToCart.Services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.casestudy.productdetailservice.Entity.Product;

@Component
@FeignClient(name="product-details", url="localhost:8082")
public interface ProductDetailsProxy {
	
	@GetMapping("/amazon/products/search/{productId}")
	public Product getProductById(@PathVariable int productId);

}
