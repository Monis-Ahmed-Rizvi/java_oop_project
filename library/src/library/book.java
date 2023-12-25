package library;

import java.time.*;
import java.util.*;


public class Book extends LibraryItem {
   
	private String isbn;
	private String title;
	private String author;
	private int numberOfPages;
	
	
	
	
	
	public Book(String itemId,boolean isAvailable,int qnty,String isbn,String title,String author,int numberOfPages,LocalDate itemDate) {
		super(itemId,isAvailable,qnty,itemDate);
	    this.isbn = isbn;
	    this.title = title;
	    this.author = author;
	    this.numberOfPages = numberOfPages;	
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getNumberOfPages() {
		return numberOfPages;
	}


	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	
	
	
	
	

}
