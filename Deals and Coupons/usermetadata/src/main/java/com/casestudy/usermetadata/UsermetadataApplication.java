package com.casestudy.usermetadata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class UsermetadataApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermetadataApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate getReatTemplate()
	{
		return new RestTemplate();
	}

}
