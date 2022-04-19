package com.micro.services;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class BookInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookInfoServiceApplication.class, args);
	}

}
