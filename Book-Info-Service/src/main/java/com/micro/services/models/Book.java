package com.micro.services.models;

public class Book {
	
	private int bookId;
	
	private String name;
	private String genre;
	
	public Book() {}
	public Book(int bookId, String name, String genre) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.genre = genre;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", genre=" + genre + "]";
	}
	
	
	
	
	

}
