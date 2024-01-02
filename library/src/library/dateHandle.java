package library;

import java.time.*;
import java.util.*;
public class dateHandle {

	public static void main(String[] args)
	{
	   LocalDate specificDate = LocalDate.of(2012, 1, 15);
       Book book1 = new Book("O1B",true,3,"E341J","JAVA for retards","Jitler",420,specificDate);
       Book book2 = new Book("O2B",true,5,"EPY1P","python for retards","Jitler",690,specificDate);
       Book book3 = new Book("O3B",true,4,"HIT69","become a master lier","Jitler",1010,specificDate);
       Book book4 = new Book("O4B",true,5,"HIT42","Eliminate you competeatiors","Patbatman",743,specificDate);
      // LocalDate specificDate = LocalDate.of(2012, 1, 15);
      // Book book2 = new Book("O1B",true,3,"E341J","JAVA for retards","Jitler",420,specificDate);
	   Library lib = new Library("Monis chad ");
	   lib.addBook(book1);
	  // lib.dispBook();
	  // System.out.println(book1.getItemDate());
	  // lib.olderBook();
	  // lib.dispBook();
	   
	   //System.out.println(book1.getAuthor());
	   //System.out.println("Enter a number");
	   //Scanner sc = new Scanner(System.in);
	   //int x ;
	   
	  // x = sc.nextInt();
	   
       LocalDate Date1 = LocalDate.of(2014, 5, 15);
       LocalDate Date2 = LocalDate.of(2024, 5, 27);
       
      person p1 = new person("Monis",20);
      
      //p1.setBorrowedDates(Date1, 0);
      
      p1.setBorrowDates(Date1, 0);
      
      //p1.setBorrowedDates(Date2, 1);
      
      
      //int x = p1.sizeDate();
       
       p1.sizeBorrowDates();
      
      
      //System.out.print(p1.getDates(1-1)); 
      
      
      p1.setDefaults(true, 0);
      p1.setDefaults(true, 1);
      
      int x = p1.sizeDefaults();
      
      System.out.println(x);
      
      
      
      
      System.out.println(p1.sizeBorrowedBook());
      p1.setBorrowedBooks(book1, 0);
      System.out.println(p1.sizeBorrowedBook());
      p1.setBorrowedBooks(book2, 1);
      System.out.println(p1.sizeBorrowedBook());
      p1.setBorrowedBooks(book3, 2);
      System.out.println(p1.sizeBorrowedBook());
       
       
      System.out.println(lib.isBookAvail(book3));
      
      lib.addBook(book1);
      lib.addBook(book2);
      lib.addBook(book3);
      lib.addBook(book4);
      
      
      
     System.out.println(book3.getQnty());
     
     
     
     person p2 = new person("Monis ahmed",34);
     lib.Borrow(p2, book1);
     lib.Borrow(p2, book2);
     lib.Borrow(p2, book3);
     lib.Borrow(p2, book4);
     
     
     
       
     System.out.println(book3.getQnty());
     
     
     
     // date 
     
     
     LocalDate today = LocalDate.now();
     LocalDate Date5 = LocalDate.of(2020, 12, 20);
     System.out.println(today.compareTo(Date5));
     
     
     // ######################################################### TODO ###########################################################################
     
     
     // have to add defaulter 
     // DVD borrow 
     // BAN deafaulter 
     
      
	}
	
	
}
