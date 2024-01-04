package todo;

public class idea {
  public static void main(String[] args)
  {
	  String name = new String();
	  name = "Monis";
	  
	  System.out.println("Hello "+name);
	  String task1 = new String();
	  String task2 = new String();
	  String task3 = new String();
	  String task4 = new String();
	  String task5 = new String();
	  
	  task1 = "Performing Coding";
	  task2 = "Attending Live Session";
	  task3 = "Watching Videos";
	  task4 = "Attending Live Session";
	  task5 = "Performing Coding";
	  
	  
	  
	  System.out.println("task 1 "+task1);
	  System.out.println("task 2 "+task2);
	  System.out.println("task 3 "+task3);
	  System.out.println("task 4 "+task4);
	  System.out.println("task 5 "+task5);
	  
	  
	  String temp;
	  
	  // ordering the task ;
	  // basic of bubble sort 
	  // Using compareTo function
	  
	  if(task1.compareTo(task2)>0)
	  {
		  temp = task1;
		  task1= task2;
		  task2 = temp;
	  }
	  if(task1.compareTo(task3)>0)
	  {
		  temp = task1;
		  task1= task3;
		  task3 = temp;
	  }
	  if(task1.compareTo(task4)>0)
	  {
		  temp = task1;
		  task1= task4;
		  task4 = temp;
	 	  
	  }
	  if(task1.compareTo(task5)>0)
	  {
		  temp = task1;
		  task1= task5;
		  task5 = temp;
	  }
 	  if(task2.compareTo(task3)>0)
 	  {
 		  temp = task2;
 		  task2 = task3;
 		  task3 = temp;
 	  }
	  if(task2.compareTo(task4)>0)
	  {
		  temp = task2;
		  task2 = task4;
		  task4 = temp;
	  }
 	  if(task2.compareTo(task5)>0)
 	  {
 		  temp = task2;
 		  task2 = task5;
 		  task5 = temp;
 	  }
 	  if(task3.compareTo(task4)>0)
 	  {
 		  temp = task3;
 		  task3 = task4;
 		  task4 =temp;
 		  
 	  }
 	  if(task3.compareTo(task5) > 0)
 	  {
 		  temp = task3;
 		  task3 = task5;
 		  task5 = temp;
 	  }
 	  if(task4.compareTo(task5) > 0)
 	  {
 		  temp = task4;
 		  task4 = task5;
 		  task5 = temp;
 	  }
	 
	 
	  
	  
	  System.out.println("Sorted");
	  System.out.println("Assending ");
	  System.out.println("task 1 "+task1);
	  System.out.println("task 2 "+task2);
	  System.out.println("task 3 "+task3);
	  System.out.println("task 4 "+task4);
	  System.out.println("task 5 "+task5);
	  
	  System.out.println("Desending ");
	  System.out.println("task 5 "+task5);
	  System.out.println("task 4 "+task4);
	  System.out.println("task 3 "+task3);
	  System.out.println("task 2 "+task2);
	  System.out.println("task 1 "+task1);
	  
	  
	  
	  // Detecting repetition
	  
	  System.out.println("Detecting repetition");
	  
	  if((task1.compareTo(task2))==0 || (task1.compareTo(task3))==0 || (task1.compareTo(task4))==0 || (task1.compareTo(task5))==0)
	  {
		  System.out.println("Duplicate : "+task1);
	  }
	  if( (task2.compareTo(task3))==0 || (task2.compareTo(task4))==0 || (task2.compareTo(task5))==0 )
	  {
		  System.out.println("Duplicate : "+task2);
	  }
	  if( (task3.compareTo(task4)) == 0 || (task3.compareTo(task5)==0 ))
	  {
	     System.out.println("Duplicate : "+task3);	  
	  }
	  if(  (task4.compareTo(task5) == 0  ))
	  {
		  System.out.println("Duplicate : "+task4);
	  }
	  
	  
  }
}
