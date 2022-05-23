package com.casestudy.usermetadata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.casestudy.usermetadata.Entity.UserMetaData;
import com.casestudy.usermetadata.Repository.UserRepo;

@SpringBootTest
class UsermetadataApplicationTests {
	
	@Autowired
	UserRepo repo;
	
	@Test
	void contextLoads() {
	}
	
	@Test
    public void testFindUserByName() {
        UserMetaData user = repo.findByName("Komal Barnwal");    
        assertThat(user.getName()).isEqualTo("Komal Barnwal");
    }
	
}
