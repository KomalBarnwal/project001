//handle all request from the frontend
package com.casestudy.usermetadata.Controller;

import java.math.BigInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.casestudy.usermetadata.Entity.UserMetaData;
import com.casestudy.usermetadata.Services.UserService;
import com.casestudy.usermetadata.Services.UserServiceImpl;

@RestController
@RequestMapping("/offerzone/users/")
public class UserController {
	
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserServiceImpl userService;
	
	@SuppressWarnings("unused")
	@Autowired
	private RestTemplate restTemplate;
    
//  postEndPoint we can take data from frontend and from post mechanism we can save data in backend server 
	@PostMapping("saveUserDetails")
	public UserMetaData saveUserDetail(@RequestBody UserMetaData userData) {
		logger.trace("Saving new user");
		UserMetaData user= userService.saveUserMetaDataTODB(userData);
		return user;
	}
	
	@PutMapping("/search/{userId}")
	public UserMetaData updateUser(@PathVariable String userId) {
		logger.trace("Updating user");
		return userService.getUserDetailsFromDB(userId);		 
	}
	
//  getEndPoint is used to fetch data from backend to frontend
    @GetMapping("getUserDetails/{name}")
	public UserMetaData getUserDetails(@PathVariable String name) {
    	logger.trace("Getting user");
    	UserMetaData user=userService.getUserDetailsFromDB(name);
		return user;
	}
    
    @PostMapping("signin")
    public boolean sigin(@RequestBody UserMetaData login) {
    	logger.trace("Signing in user");
    	UserMetaData user = userService.findByUsername(login.getEmail(), login.getPassword());
    	System.out.println(user);
    	
    	if (user != null) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }	

}
