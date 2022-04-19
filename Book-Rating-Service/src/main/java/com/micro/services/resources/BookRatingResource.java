package com.micro.services.resources;
import java.util.*;

import com.micro.services.models.BookRating;
public class BookRatingResource {
	
	private static List<BookRating> ratings;
	
	static {
		ratings  = new ArrayList<BookRating>(Arrays.asList(
				
				new BookRating(101,5),
				new BookRating(102,3),
				new BookRating(103,4),
				new BookRating(104,1),
				new BookRating(105,2)
			));
	}
	
	public static List<BookRating> getBookRatings(){
		return ratings;
	}
	
	public static BookRating GetBookById(int id) {
		return ratings.stream().filter(b->b.getBookId() == id).findFirst().get();
	}
//	public static void main(String...args)
//	{
//		System.err.println(BookRatingResource.getBookRatings());
//	}

	
}
