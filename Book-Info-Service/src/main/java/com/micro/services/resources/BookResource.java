package com.micro.services.resources;


import java.util.*;

import com.micro.services.models.Book;

public class BookResource {
	
	private static List<Book> books;
	
	static {
		books = new ArrayList<Book>(Arrays.asList(
				
				new Book(101,"This book is about the spring framework","Technology"),
				new Book(102,"This book is about the life and ways","Self-help"),
				new Book(103,"This book is about life hacks","Life"),
				new Book(104,"On BlockChain Technology","Technology")
			));
	}
	
	public static List<Book> getBooks(){
		return books;
	}
	
	public static Book getBookById(int id)
	{
		return books.stream().filter(b->b.getBookId()==id).findFirst().get();
	}
	
	
//    public static void main(String...args)
//    {
//    	System.out.println(BookResource.getBooks());
//    }
	
	

}
