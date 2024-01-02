package library;

import java.time.*;
import java.util.*;

import java.time.*;

public class Library {
   
	private ArrayList<Book> books;
	private ArrayList<DVD> dvds;
    private String LibraryName;
    private ArrayList<person> member; 
    
    public Library(String LibraryName) {
    	
    	this.LibraryName = LibraryName;
    	books = new ArrayList<Book>();
    	dvds = new ArrayList<DVD>();
    	member = new ArrayList<person>();
    }
	
    
    //  ##################################### BOOK FUCTIONS ##############################################
    
	public void addBook(Book book)
	{
		books.add(book);
	}
	
	
	public void ReduceQnt(Book book)
	{
		int x = book.getQnty();
		book.setQnty(x-1);
	}
	

	// remove at certain index
	
	public Book removeBook(int i)
	{
	   return books.remove(i);	
	}
	
	
	// remove the last book
	public Book removeBook()
	{
		int i = books.size()-1;
		return books.remove(i);
	}
	// remove books older than 5 years
	public void olderBook()
	{
	    
		for(int i =0;i<books.size();i++)
		{
			
			Book book_obj = books.get(i);
		    LocalDate today = LocalDate.now();    
		    if(today.compareTo(book_obj.getItemDate())>=5)
		    {
		    	System.out.println(book_obj.getTitle()+" "+book_obj.getAuthor()+" "+book_obj.getIsbn());
		    }
		   
		}
	     
		System.out.println("Do you want to remove the old books(Y/N)");
		Scanner in = new Scanner(System.in);
		char decision = in.next().charAt(0);
		if(decision == 'Y' || decision == 'y')
		{
			for(int i =0;i<books.size();i++)
			{
				Book book_obj = books.get(i);
			    LocalDate today = LocalDate.now(); 
			    if(today.compareTo(book_obj.getItemDate())>=5)
			    {
			    	books.remove(i);
			    }
			   
			}
		    	
		}
		else
		{
			System.out.println("Exit");
		}
		
	}
	
	public void dispBook()
	{
		
		for(int i =0;i<books.size();i++)
		{
			Book book_obj = books.get(i);
			System.out.println("title"+book_obj.getTitle());
		}
		System.out.println("Done..");
	}
	
	public void  searchBookByauthor(String author) 
	{
		int index ;
		for(index = 0;index<books.size();index++)
		{
			Book book_obj = books.get(index);
			if(book_obj.getAuthor() == author)
			{
		       System.out.println("author:"+book_obj.getAuthor()+" Index "+index);		 
			}
		}
		 
	}
	
	
	
	
	public int searchBookByIsbn(String num) 
	{
		 int index = 0;
		 for(index =0;index<books.size();index++)
		 {
			 Book book_obj = books.get(index);
			 if(book_obj.getIsbn()==num)
			 {
				 System.out.println("title:"+book_obj.getTitle()+" "+"isbn:"+book_obj.getIsbn()+" "+"index:"+index);
				 return index;
			 }
		 }
		 
		 return index;
	}
	
	
	
	public int  searchBookByNumPage(int pageNum) 
	{
		int index = 0;
		for(index = 0;index<books.size();index++)
		{
			Book book_obj = books.get(index);
			if(book_obj.getNumberOfPages()<=pageNum)
			{
				System.out.println(book_obj.getTitle()+" "+book_obj.getNumberOfPages());
			}
		}
		
	    return index;
	}
	
	
	public boolean isBookAvail(Book book) {
		for(int i =0;i<books.size();i++)
		{
			Book inBook = books.get(i);
			if(inBook.equals(book))
			{
				if(book.getQnty()==0)
				{
					return false;
				}
				else if(book.getQnty() >0)
				{
					return true;
				}
				
			}
		}
		
		return false;
	}
	
	
	
	// ##################################### DVD FUCTIONS ##############################################
	
	
	
	public void dispDVD()
	{
		for(int i =0;i<=dvds.size();i++)
		{
			DVD dvd_obj = dvds.get(i);
			System.out.println("title"+dvd_obj.getTitle());
		}
	}
	
	
	public void addDVD(DVD dvd)
	{
		dvds.add(dvd);
	}
	
	
	public DVD removeDVD(int i)
	{
		
		return dvds.remove(i);
	}
	
	
	public DVD removeDVD()
	{
		int i = dvds.size()-1;
		return dvds.remove(i);
	}
	
	
	// remove books older than 5 years
		public void olderDVD()
		{
			for(int i =0;i<dvds.size();i++)
			{		
				DVD dvd_obj = dvds.get(i);
			    LocalDate today = LocalDate.now();    
			    if(today.compareTo(dvd_obj.getItemDate())>=5)
			    {
			    	System.out.println(dvd_obj.getTitle()+" "+dvd_obj.getDirector()+" "+dvd_obj.getDuration());
			    }  
			}
			System.out.println("Do you want to remove the old DVDs(Y/N)");
			Scanner in = new Scanner(System.in);
			char decision = in.next().charAt(0);
			if(decision == 'Y' || decision == 'y')
			{
				for(int i =0;i<dvds.size();i++)
				{
					DVD dvd_obj = dvds.get(i);
				    LocalDate today = LocalDate.now(); 
				    if(today.compareTo(dvd_obj.getItemDate())>=5)
				    {
				    	dvds.remove(i);
				    }	   
				} 	
			}
			else
			{
				System.out.println("Exit");
			}
		}
	
		
		public void searchDVDByDirector(String name) {
		
			int index = 0;
			for(index = 0;index<dvds.size();index++)
			{
				DVD dvd_obj = dvds.get(index);
				if(dvd_obj.getDirector() == name)
				{
					System.out.println(dvd_obj.getTitle()+" "+dvd_obj.getDirector());
				}
				
			}
			
		}
		
		
		public void searchDVDByduration(float num) {
			
			int index = 0;
			for(index = 0;index<dvds.size();index++)
			{
				DVD dvd_obj = dvds.get(index);
				if(dvd_obj.getDuration() <= num)
				{
					System.out.println(dvd_obj.getTitle()+" "+dvd_obj.getDuration());
				}
			}
			
			
			
			
		}
	
		
		// ################################ Persons ########################################### 
		
		
		public boolean isMember(person p_obj)
		{
			int index; 
			for(index=0;index < member.size();index++)
			{
				person pc_obj = member.get(index);
				if(pc_obj.equals(pc_obj))
				{
					return true;
				}	
			}
			return false;	
		}
		
		
		
		public void addMember(person p_obj)
		{
			member.add(p_obj);	
		}
		
		
		
		public int indexPerson(person p_obj)
		{
			if(!isMember(p_obj))
			{
				return -1;
			}
			else
			{ 
			  for(int i =0;i<member.size();i++)
			  {
				  person pobj = member.get(i);
				  if(p_obj.equals(pobj))
				  {
					  return i;
				  }
			  }
			}
			return -1;
		}
		
		
		public person removeMember(int n)
		{
			return member.remove(n);
		}
		
		
		public void issueDefault(person p_obj)
		{
			// today date 
			LocalDate today = LocalDate.now();
			// issue date 
			int x = p_obj.sizeBorrowDates();		
			for(int i =0;i<x;i++)
			{
				LocalDate issueDate = p_obj.getBorrowDates(i);
				// compare dates 
				if(today.compareTo(issueDate)>=14)
				{
					p_obj.setDefaults(true, i);
				}
				// issues default 
			}
					
			
		}
		
		
		
		public Book Borrow(person p_obj,Book book)
		{
			
			LocalDate today =  LocalDate.now();
			
			if(!isMember(p_obj))
			{
				System.out.println("Not a member");
				System.out.println("do want to become member of "+this.LibraryName+" Y/N");
				Scanner sc = new Scanner(System.in);
				char ch = sc.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					addMember(p_obj);
				}
				else
				{
					return null;
				}
			}
			
			
				if(!isBookAvail(book))
				{
					System.out.println("Book not availabe");
					return null;
				}
				
				
				int sizeBook= p_obj.sizeBorrowedBook();
				if(sizeBook>=3)
				{
					System.out.println("can not borrow more Limit reached");
					return null;
				}
				else
				{
					if(sizeBook==0)
					{
						// check if book is available 
						p_obj.setBorrowedBooks(book, 0);
						ReduceQnt(book);
						p_obj.setBorrowDates(today, 0);
						System.out.println("Book "+book.getTitle()+" issued to "+p_obj.getName());
						return book;
					}  
					else
					{
						p_obj.setBorrowedBooks(book, sizeBook);
						ReduceQnt(book);
						p_obj.setBorrowDates(today, 0);
						System.out.println("Book "+book.getTitle()+" issued to "+p_obj.getName());
						return book;
					}
				}
			
		}
		
		
	
}
