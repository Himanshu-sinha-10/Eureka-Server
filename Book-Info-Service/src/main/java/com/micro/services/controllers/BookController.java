package com.micro.services.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.services.models.Book;
import com.micro.services.resources.BookResource;

@RestController
@RequestMapping("/book-service")
public class BookController {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@GetMapping("/book/{id}")
	public Book getAllBooks(@PathVariable int id){
		
		


		
	
		return BookResource.getBookById(id);
//		return new Book(101,"Spring Framework","Technology");
	}

	
}
