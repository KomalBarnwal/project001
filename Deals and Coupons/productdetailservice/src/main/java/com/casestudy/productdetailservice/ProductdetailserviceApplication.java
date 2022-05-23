package com.casestudy.productdetailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class ProductdetailserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductdetailserviceApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate getReatTemplate()
	{
		return new RestTemplate();
	}

}
