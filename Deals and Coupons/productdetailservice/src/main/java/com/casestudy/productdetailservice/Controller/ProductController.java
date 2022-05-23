package com.casestudy.productdetailservice.Controller;

import java.math.BigInteger;
import java.util.List;
//import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.casestudy.productdetailservice.Entity.Product;
import com.casestudy.productdetailservice.Services.ProductService;

@RestController
@RequestMapping("/offerzone/products")
public class ProductController {
	
	Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	ProductService productService;
	
	@SuppressWarnings("unused")
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/save")
	public Product saveData(@RequestBody Product product) {
		logger.trace("New Product Added");
		return productService.addProduct(product); 
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts() {
		logger.trace("Getting all Products");
		return productService.findAllProducts();
	}
	
	@PutMapping("/update/{productId}")
	public Product updateProduct(@RequestBody Product product,@PathVariable String productId) {
		logger.trace("Updating the Product");
		return productService.updateProduct(product,productId);
	}
	
	@DeleteMapping("/product/{id}")
	void deleteProduct(@PathVariable String id) {
		logger.trace("Deleting the Product");
		productService.deleteById(id);
	}
	
//	@GetMapping("/search/{productId}")     //this can be implemented in our frontend
//	public ArrayList<Product> getProductById(@PathVariable int productId) {
//		return productService.getProductDetails(productId);
//	}
	
//	@PutMapping("/search/{productId}")
//	public ArrayList<Product> updateProduct() {
//		return productService.update(product);
//	}
	
//	@DeleteMapping("/search/remove{productId}")
//	public ArrayList<Product> deleteProductById(@PathVariable int productId) {
//		return productService.getProductDetails(productId);
//	}
	
}
