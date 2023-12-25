package library;

import java.time.*;
import java.util.*;


public  class LibraryItem {

	private String itemId;
	private boolean isAvailable;
	private int qnty;
	private LocalDate itemDate; 
	private String color; 
	
	public LibraryItem()
	{
		System.out.println("Hello world");
	}
	
	
	
	
	public LibraryItem(String itemId,boolean isAvailable,int qnty,LocalDate itemDate) {
		
		this.itemId = itemId;
		this.isAvailable = isAvailable;
		this.qnty = qnty;
		this.itemDate = itemDate;
		
	}
	
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public int getQnty() {
		return qnty;
	}
	public void setQnty(int qnty) {
		this.qnty = qnty;
	}
	
	
	public void isAvailableStatus()
	{
		if(qnty==0)
		{
			isAvailable = false;
		}
		else
		{
			isAvailable = true;
		}
	}


	public LocalDate getItemDate() {
		return itemDate;
	}


	public void setItemDate(LocalDate itemDate) {
		this.itemDate = itemDate;
	}
	


	
	
	
}
