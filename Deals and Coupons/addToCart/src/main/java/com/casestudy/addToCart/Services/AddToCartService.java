package com.casestudy.addToCart.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.casestudy.addToCart.Entity.Cart;
import com.casestudy.addToCart.Repository.AddToCartRepo;

@Service
public class AddToCartService {

	@Autowired
	AddToCartRepo addToCartRepo;
	
	public void addItemTOCartService(Cart cart) {
		addToCartRepo.save(cart);
	}
	
    public void removeItemFromCartService(String id) {
    	addToCartRepo.deleteById(id);
	}

//    public CartDetails displayAllProductsInCart(long id) {
//		CartDetails cartDetails=new CartDetails();
//		cartDetails.setUserId(userId);
//		
//		ArrayList<Cart> cartList = addToCartRepo.findByuserId(userId);
//		ArrayList<Product> productList=new ArrayList<Product>();
//		
//		for(int i=0;i<cartList.size();i++) {
//			Product product=productDetailsProxy.getProductById(cartList.get(i).getProductId());
//			productList.add(product);
//		}
//		
//		cartDetails.setList(productList);	
//		return cartDetails;
//		
//	}

}
