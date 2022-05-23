package com.casestudy.addToCart.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.addToCart.Entity.Cart;
import com.casestudy.addToCart.Services.AddToCartService;

@RestController
@RequestMapping("/offerzone/addToCart")
public class AddToCartController {
	
	Logger logger = LoggerFactory.getLogger(AddToCartController.class);

	@Autowired
	AddToCartService addToCartService;
	
	@PostMapping("/add")
	public void addToCart(@RequestBody Cart cart) {
		logger.trace("Add to cart called");
		addToCartService.addItemTOCartService(cart);
	}
	
	@DeleteMapping("/remove/{id}")
	public void removeFromCart(@PathVariable String id) {
		logger.trace("Remove from cart called");
		addToCartService.removeItemFromCartService(id);
	}
	
	/*
	 * @GetMapping("/show/{userId}") public void showItems(@PathVariable long id) {
	 * addToCartService.displayAllProductInCart(id); }
	 */
	
}
