package com.casestudy.productdetailservice.Repository;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.productdetailservice.Entity.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product, String> {


	Product findByCompanyName(String CompanyName);
//	Product deleteById(Product product);

}
