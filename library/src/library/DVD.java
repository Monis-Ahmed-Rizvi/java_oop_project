package library;


import java.time.*;
import java.util.*;


public class DVD extends LibraryItem {

	private String title;
	private String director;
	private float duration;
	private boolean reWrite ;
	
	public DVD()
	{
		System.out.println("DVD object created");
	}
	
	
	public DVD(String itemId, boolean isAvailable, int qnty,String title,String director,float duration,boolean reWrite,LocalDate itemDate) {
		super(itemId, isAvailable, qnty,itemDate);
		this.title = title;
		this.director = director;
		this.duration = duration;
		this.reWrite = reWrite;
		
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public float getDuration() {
		return duration;
	}


	public void setDuration(float duration) {
		this.duration = duration;
	}


	public boolean isReWrite() {
		return reWrite;
	}


	public void setReWrite(boolean reWrite) {
		this.reWrite = reWrite;
	}
	
	

	
	
	
}
