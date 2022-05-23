package com.casestudy.productdetailservice;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import com.casestudy.productdetailservice.Entity.Product;
import com.casestudy.productdetailservice.Repository.ProductRepo;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
class ProductdetailserviceApplicationTests {

	@Autowired
	ProductRepo repo;
	@Test
	void contextLoads() {
	}
	
	@Test
    @Rollback(true)
    public void testCreateProduct() {
        Product savedProduct = repo.save(new Product(null, "Nike", "Discound", "alskdml", "sdkbcjkasd",  "24hr"));     
        assertThat(savedProduct.getCompanyName()).isEqualTo("Nike");
    }
	
	@Test
	public void getAllProducts() {
		List<Product> products = (List<Product>) repo.findAll();
		assertThat(products).size().isGreaterThan(0);
	}
	
//	@Test
//    @Rollback(true)
//    public void testUpdateProduct() {
//        Product product = repo.findByCompanyName("Nike");
//        product.setValidity("30th sept");     
//        repo.save(product);    
//        Product updatedProduct = repo.findByCompanyName("Nike");     
//        assertThat(updatedProduct.getValidity()).isEqualTo("30th sept");
//    }
	
	@Test
    @Rollback(false)
    public void testDeleteProduct() {
        Product product = repo.findByCompanyName("Nike");     
        repo.deleteById(product.getproductId());     
        Product deletedProduct = repo.findByCompanyName("Nike");     
        assertThat(deletedProduct).isNull();            
    }
}
