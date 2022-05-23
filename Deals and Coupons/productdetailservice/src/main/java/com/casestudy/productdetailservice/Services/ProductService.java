package com.casestudy.productdetailservice.Services;

import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.productdetailservice.Entity.Product;
import com.casestudy.productdetailservice.Repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;
	
	public Product addProduct(Product product) {
		return productRepo.save(product);
	}
	
	public Product updateProduct(Product productUpdated, String id) {
		return productRepo.findById(id)
		.map(product -> {
			product.setCompanyName(productUpdated.getCompanyName());
			product.setOfferType(productUpdated.getOfferType());
			product.setDesc(productUpdated.getDesc());
			product.setImageURL(productUpdated.getImageURL());
			product.setValidity(productUpdated.getValidity());
	        return productRepo.save(product);
	      })
	      .orElseGet(() -> {
	    	 productUpdated.setproductId(id);
	        return productRepo.save(productUpdated);
	      });
	}
	
	public void deleteById(String id) {
		productRepo.deleteById(id);
	}
	
	public List<Product> findAllProducts() {
		return productRepo.findAll();
	}
	
	//	Product save(Product product);

//	Product update(Product product);

//	ArrayList<Product> findAllProducts();

//	ArrayList<Product> getProductDetails(int productId);

//	ArrayList<Product> findAll();

//	Product delete(Product product);

//	ArrayList<Product> getProductDetails(String CompanyName );

}
