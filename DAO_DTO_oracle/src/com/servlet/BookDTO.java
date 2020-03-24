package com.servlet;

public class BookDTO {
	
	//book table Ä®·³ ÀÌ¸§´ë·Î ¸¸µé¸é µÊ
	int bookId;
	String bookName;
	String bookLoc;
	
	public BookDTO(int bookId, String bookName, String bookLoc) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookLoc = bookLoc;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getBookLoc() {
		return bookLoc;
	}

}
