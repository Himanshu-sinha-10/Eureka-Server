package com.Server2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

import com.netflix.appinfo.InstanceInfo;

import com.netflix.discovery.shared.Application;


@SpringBootApplication
@EnableEurekaServer
public class MyEurekaServer2Application {
//	@Bean
//	public DiscoveryClient getClient() {
//		return new DiscoveryClient()
//	}
	

	public static void main(String[] args) {
		SpringApplication.run(MyEurekaServer2Application.class, args);
  
	}

}
