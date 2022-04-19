package com.micro.services.models;

public class ArchiveModel {
	
	private int bookId;
	private String name;
	private int rating;
	
	public ArchiveModel() {}
	public ArchiveModel(int bookId, String name, int rating) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.rating = rating;
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "ArchiveModel [bookId=" + bookId + ", name=" + name + ", rating=" + rating + "]";
	}
	
	
	
	
	

}
