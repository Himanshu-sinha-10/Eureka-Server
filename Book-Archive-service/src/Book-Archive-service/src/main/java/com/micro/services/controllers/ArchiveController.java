package com.micro.services.controllers;

import java.net.URI;

import java.util.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import com.micro.services.models.ArchiveModel;
import com.micro.services.models.Book;
import com.micro.services.models.BookRating;

@RestController
@RequestMapping("/book-archive-service")
public class ArchiveController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	WebClient.Builder builder;
	
	@Autowired
	private DiscoveryClient discoveryClient;

	
	@GetMapping("/get-book/{id}")
	public List<ArchiveModel> getBookArchiveModel(@PathVariable int id){
		

		String url1 = "http://Book-Info/book-service/book/"+id;
		Book fetchedBook = builder.build()
		   .get()
		   .uri(url1)
		   .retrieve()
		   .bodyToMono(Book.class)
		   .block();
		
//		Book fetchedBook = restTemplate.getForObject(url1, Book.class);
		String url2 = "http://Book-Rating/book-rating-service/rating/"+fetchedBook.getBookId();
		BookRating fetchedRating = builder.build()
										  .get()
										  .uri(url2)
										  .retrieve()
										  .bodyToMono(BookRating.class)
										  .block();
//		BookRating fetchedRating = restTemplate.getForObject(url2, BookRating.class);
		List<ArchiveModel> l = new ArrayList<>(Arrays.asList(
				
				new ArchiveModel(fetchedBook.getBookId(),fetchedBook.getName(),fetchedRating.getRating())
				
				));
	return l;
		
		
	}
	
	@GetMapping("/get-instance/{serviceName}")
	public URI  serviceUrl(@PathVariable String serviceName) {
		    List<ServiceInstance> list = discoveryClient.getInstances(serviceName);
		    if (list != null && list.size() > 0 ) {
		        return list.get(0).getUri();
		    }
		    return null;
		}
	

@GetMapping("/get-instance-list/{serviceName}")
public List<ServiceInstance>  serviceUrl2(@PathVariable String serviceName) {
	    List<ServiceInstance> list = discoveryClient.getInstances(serviceName);
//	    if (list != null && list.size() > 0 ) {
//	        return list.get(0).getMetadata();
	    
//	    }
	    return list;
	}
}
	
	
	


