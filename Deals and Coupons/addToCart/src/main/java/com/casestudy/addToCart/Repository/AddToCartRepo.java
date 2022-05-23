
package com.casestudy.addToCart.Repository;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.addToCart.Entity.Cart;

@Repository
public interface AddToCartRepo extends MongoRepository<Cart, String> {

	@SuppressWarnings("unchecked")
	Cart save(Cart cart);
	void delete(Cart cart);
//	ArrayList<Cart> findByid(long id);
	
}
