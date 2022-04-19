package com.micro.services.models;

public class BookRating {

	private int bookId;
	private int rating;
	
	public BookRating() {}

	public BookRating(int bookId, int rating) {
		super();
		this.bookId = bookId;
		this.rating = rating;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "BookRating [bookId=" + bookId + ", rating=" + rating + "]";
	}
	
}
