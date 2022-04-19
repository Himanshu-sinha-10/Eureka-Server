package com.Server2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import com.netflix.discovery.shared.Application;

@RestController


@RequestMapping("server")

public class ServerController {
	
//	@Autowired
//    DiscoveryClient discoveryClient;
//	
//	@GetMapping("/get")
//	public ResponseEntity<List<Application>> getInstances(){
//		
//	      List<Application> applications = discoveryClient.getApplications().getRegisteredApplications();
//
//	      for (Application application : applications) {
//	          List<InstanceInfo> applicationsInstances = application.getInstances();
//	          for (InstanceInfo applicationsInstance : applicationsInstances) {
//
//	              String name = applicationsInstance.getAppName();
//	              String url = applicationsInstance.getHomePageUrl();
//	              System.out.println(name + ": " + url);
//	              System.out.println();
//	          }
//	      }
//	      
//	      return new ResponseEntity<List<Application>>(applications,HttpStatus.OK);
//		
//	}
	
	

}
