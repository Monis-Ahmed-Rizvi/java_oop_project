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
		//sc.useDelimiter("\\n");
		
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
					status =  false;
				   t1 = new Task();
				   System.out.println("Enter task id");
				   t1.setId(sc.nextInt());
				   Scanner str = new Scanner(System.in);
				   System.out.println("Enter task title");
				   t1.setTitle(str.nextLine());
				   System.out.println();
				   System.out.println("Enter task text");
				   Scanner str1 = new Scanner(System.in);
				   t1.setText(str1.nextLine());
				   status = control.addTask(t1);
				   
				   if(status==true)
				   {
					   System.out.println("Task added");
				   }
				   else
				   {
					   System.out.println("could not add task");
				   }
	
				   
				}
				break;

			case 2:
				if(control.isEmpty())
				{
					System.out.println("No task to remove");
				}
				else
				{
					status = false;
					System.out.println("Enter the id to remove task ");
					id = sc.nextInt();
					status = control.removeTask(id);
					if(status==true)
					{
						System.out.println("Task removed");
					}
					else
					{
						System.out.println("could not remove the task");
					}
				}
				break;
				

			case 3:
				if(control.isEmpty())
				{
					System.out.println("NO task to update");
				}
				else
				{
					status = false;
					t1 = new Task();
					System.out.println("enter the ID of task to update");
					t1.setId(sc.nextInt());
					System.out.println("Enter the title ");
					t1.setTitle(sc.next());
					System.out.println("Enter the text ");
					t1.setText(sc.next());
					
					status = control.updateTask(t1);
					if(status==true)
					{
						System.out.println("task updated ");
					}
					else
					{
						System.out.println("task couldnt be updated");
					}
				}
				break;	
				
				

			case 4:
				// search task based on id 
				if(control.isEmpty())
				{
					System.out.println("No task found in the array ");
				}
				else
				{
				   t1 = new Task();
				   status =  false;
				   System.out.println("Enter the id to search");
				   id = sc.nextInt();
				   t1 = control.searchTask(id);
				   System.out.println(t1.toString());
				   
				}
				break;
				
				

			case 5:
				// assign task to a user 
				// 
				if(control.isEmpty())
				{
					System.out.println("No task available");
				}
				else
				{
					System.out.println("Enter a  title of the task");
					title = sc.next();
					System.out.println("Enter the user name to assign");
					user = sc.next();
					status = control.assignTask(title, user);
					if(status==true)
					{
						System.out.println("Task assingned");
					}
					else
					{
						System.out.println("task couldnt be assigned ");
					}
				}
				break;
				

			case 6:
				// display all the task 
				if(control.isEmpty())
				{
					System.out.println("NO task to diplay");
				}
				else
				{
					tasks = control.getAllTasks();
					for(int i =0;i<tasks.length;i++)
					{
						System.out.println(tasks[i]);
					}
				}
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
