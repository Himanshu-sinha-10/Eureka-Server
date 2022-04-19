package com.micro.services.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.services.models.BookRating;
import com.micro.services.resources.BookRatingResource;

@RestController
@RequestMapping("/book-rating-service")
public class BookRatingController {
	
	@GetMapping("/ratings")
	public List<BookRating> getAllBooksRatings(){
		return BookRatingResource.getBookRatings();
	}
	
	@GetMapping("rating/{id}")
	public BookRating getBookRatingById(@PathVariable int id)
	{
		return BookRatingResource.GetBookById(id);
	}
	

}
