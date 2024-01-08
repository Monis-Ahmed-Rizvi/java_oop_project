package todo;
import java.util.*;

public class menu {
    
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		Task t1 = null;
		Task[] tasks;
		Taskfunctionimp control = new Taskfunctionimp();
		int id = 0;
		String user, title;
		boolean status = false;
		
		do {
			
			System.out.println("1. Insert a Task");
			System.out.println("2. Remove a task");
			System.out.println("3. Update a Task");
			System.out.println("4. Search a task");
			System.out.println("5. Assign a Task");
			System.out.println("6. Display All Tasks");

			System.out.println("0. Logout");

			System.out.println("Enter your choice");
			ch = sc.nextInt();
			
			
			switch(ch)
			{
			case 1:
				if(control.isFull())
				{
					System.out.println("Array is full");
				}
				else
				{
				   t1 = new Task();
				   System.out.println("Enter task id");
				   t1.setId(sc.nextInt());
				   System.out.println("Enter task title");
				   t1.setTitle(sc.next());
				   System.out.println("");
				   
				}
				break;

			case 2:
				System.out.println("2");
				break;
				

			case 3:
				System.out.println("3");
				break;	
				
				

			case 4:
				System.out.println("4");
				break;
				
				

			case 5:
				System.out.println("5");
				break;
				

			case 6:
				System.out.println("6");
				break;
				
				
				

			case 0:
				System.out.println("");
				System.out.print("Exit");
				System.out.print(".");
				System.out.print(".");
				System.out.print(".");
				System.out.print(".");
				System.out.print(".");
				
				
				break;
			}
			
			
			
			
			
			
		}while(ch!=0);
		
		
	}
	
	
	
}
