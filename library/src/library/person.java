package library;

import java.time.*;
import java.util.*;


public class person {
  
	private int personId;
	private String name;
	private Book[] BorrowedBooks = new Book[3];
	private LocalDate [] BorrowDates = new LocalDate[3];
	private boolean [] Defaults = new boolean[3];
	private boolean isMember;
	private boolean isBanned;
	
	
	
	// constructor 
	
	person(String name,int id)
	{
		this.name = name;
		this.personId = id;
		isMember = false;
		isBanned = false;
	}
	
	// array getter,setter and size 
	
	public void  setBorrowedBooks(Book book_obj,int n)
	{
		this.BorrowedBooks[n] = book_obj;
	}
	
	public void  setBorrowDates(LocalDate date,int n)
	{
		this.BorrowDates[n] = date;
	}
	
	public void setDefaults(boolean bool,int n)
	{
	  this.Defaults[n] = bool; 
	}
	
	
	public Book getBorrowedBooks(int index) {
		return this.BorrowedBooks[index];
		
	}
	
	
	public LocalDate getBorrowDates(int index) {
		return this.BorrowDates[index];
	}
	
	public boolean getDefaults(int index) 
	{
		return this.Defaults[index];
	}
	
	
	
	public int sizeBorrowDates()
	{      
		   int index = 0;
	       for(LocalDate date:this.BorrowDates)
	       {
	    	   if(date == null)
	    	   {
	    		   break;
	    	   }
	    	   index++;   
	       }
	       return index;
	}
	
	
	
	public int sizeBorrowedBook()
	{      
		   int index = 0;
	       for(Book book:this.BorrowedBooks)
	       {
	    	   if(book == null)
	    	   {
	    		   break;
	    	   }
	    	   index++;   
	       }
	       return index;
	}
	
	
	

	public int sizeDefaults()
	{      
		   int index = 0;
	       for(boolean fault:this.Defaults)
	       {
	    	   if(fault)
	    	   {
	    		   index++; 
	    	   }
	    	      
	       }
	       return index;
	}
	
	
	
	
	
	
	
	
	// simple getter setter 
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMember() {
		return isMember;
	}
	public void setMember(boolean isMember) {
		this.isMember = isMember;
	}
	public boolean isBanned() {
		return isBanned;
	}
	public void setBanned(boolean isBanned) {
		this.isBanned = isBanned;
	}

	
	
	
	
	
	
}
