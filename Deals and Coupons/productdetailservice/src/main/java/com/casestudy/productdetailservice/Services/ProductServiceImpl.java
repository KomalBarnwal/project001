//package com.casestudy.productdetailservice.Services;
//
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import com.casestudy.productdetailservice.Entity.Product;
//import com.casestudy.productdetailservice.Repository.ProductRepo;
//
//@Service
//public class ProductServiceImpl {
//	
//	@Autowired
//	ProductRepo productRepo;
//
//	@SuppressWarnings("unused")
//	@Autowired
//	private RestTemplate restTemplate;
//
//	@Override
//	public Product save(Product product) {
//		return productRepo.save(product);
//	}
//
//	@Override
//	public Product update(Product product) {
//		return productRepo.insert(product);
//	}
//
//	@Override
//	public ArrayList<Product> findAllProducts() {
//		return (ArrayList<Product>) productRepo.findAll();
//	}
//
////	@Override
////	public ArrayList<Product> getProductDetails(int productId) {
////		return productRepo.findBy(productId);
////	}
//
////  Search function
////	@Override
////	public ArrayList<Product> getProductDetails(String CompanyName) {
////		return productRepo.getClass(CompanyName);
////	}
//	
//// void delete(Product product);
////	@Override
////	public Product delete(Product product) {
////		return productRepo.delete(product);
////	}
//
//}
//
//
//
//
//
//
//
//
