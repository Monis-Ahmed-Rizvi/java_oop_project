package TODO_IP;
import java.util.*;
public class clientMenu {
	 
	 TaskFunctionImp task_obj;
     UserFunctionImp User_obj;
     public void client_Menu(TaskFunctionImp task_obj,UserFunctionImp User_obj)
     {
       boolean status = false;
       Scanner sc = new Scanner(System.in);
       Task t;
       Task tasks[] = null;
       int ch;
       int id;
       String title,text;
       String user;
       String mail;
       this.task_obj = task_obj;
       this.User_obj = User_obj;
       do {
    	  
    	  System.out.println("1 Insert a task"); 
    	  System.out.println("2 Update the task");  
    	  System.out.println("3 delete the task ");
    	  System.out.println("4 serach the task ");
    	  System.out.println("5 Assign the task");
    	  System.out.println("6 Assign completion date to task");
    	  System.out.println("7 Arrange task in ascending order");
    	  System.out.println("8 Arrange task in descending order");
    	  System.out.println("0 Logout ");
    	  
    	  System.out.println("Enter you choice");
    	  
    	  ch = sc.nextInt();
    	  sc.nextLine();
    	  switch(ch)
    	  {
    	  
    	  case 0:
    		  System.out.println("Logging out");
    		  break;
    	  
    	  
    	  case 1:
    		  status = false;
    		  if(task_obj.isFull())
    		  {
    			  System.out.println("No more task can be added ");
    			  break;
    		  }
    		  else
    		  {
    		  t = new Task();
    		  Scanner str = new Scanner(System.in);
    		  System.out.println("Enter task id ");
    		  t.setId(sc.nextInt());
    		  System.out.println("Enter task title ");
    		  t.setTitle(str.nextLine());
    		  System.out.println("Enter the task text");
    		  t.setText(str.nextLine());
    		  status = task_obj.addTask(t);
    		  if(status==true)
    		  {
    			  System.out.println("task added ");
    		  }
    		  else
    		  {
    			System.out.println(" Task couldnt be added ");  
    		  }
    		  
    		  
    		  
    		  }
    		  
    		
    		  
    		  break;
    		  
    	  case 2:
    		  if(task_obj.isEmpty())
    		  {
    			  System.out.println("No task availabe to update");
    		  }
    		  else
    		  {
    			  status = false;
    			  t = new Task();
    			  Scanner str = new Scanner(System.in);
    			  System.out.println("Enter task id");
    			  t.setId(sc.nextInt());
    			  System.out.println(" Enter task title ");
    			  t.setText(str.nextLine());
    			  System.out.println("Enter task text");
    			  t.setText(str.nextLine());
    			  status = task_obj.updateTask(t);
    			  
    			  if(status == true)
    			  {
    				  System.out.println("task updated");
    			  }
    			  else
    			  {
    				 System.out.println("Task not updated");
    			  }
    			  
    		  }
    		  break;
    	  case 3:
    		  if(task_obj.isEmpty())
    		  {
    			  System.out.println("No task to delete ");
    		  }
    		  else
    		  {
    			  
    			  status = false;
    			  System.out.println("Enter a task id");
    			  id = sc.nextInt();
    			  
    			  status = task_obj.removeTask(id);
    			  
    			  if(status == true)
    			  {
    				  System.out.println("task removed");
    			  }
    			  else
    			  {
    				  System.out.println("task could not be removed ");
    			  }
    		  }
    		  break;
    	  case 4:
    		  if(task_obj.isEmpty())
    		  {
    			  System.out.println("no task availabe");
    		  }
    		  else
    		  {
    			  status =  false;
    			  System.out.println("Enter a number");
    			  id = sc.nextInt();
    			  t = task_obj.searchTask(id);
    			  if(t==null)
    			  {
    				  System.out.println("No task found ");
    			  }
    			  else 
    			  {
    			    System.out.println(t.toString());
    			  }
    		  }
    		  break;
    		  
    	  case 5:
    		  if(task_obj.isEmpty())
    		  {
    			  System.out.println("No tasks available");
    		  }
    		  else
    		  {
    			  status = false;
    			  Scanner str = new Scanner(System.in);
    			  
    			  System.out.println("Enter the title of the task ");
    			  title = str.nextLine();
    			  
    			  System.out.println("Enter the name of user to assign ");
    			  user = str.nextLine();
    			  
    			  
    			  System.out.println("Enter mail associted with the User");
    			  mail = str.nextLine();
    			  
    			  
    			  // check if user exist 
    			  
    			  
    			  if(User_obj.isUserExist(mail))
    			  {
    				  status = task_obj.assignTask(title, user);
    				  if(status==true)
        			  {
        				  System.out.println(" Task assigned ");
        			  }
        			  else
        			  {
        				  System.out.println(" Task could not be assigned ");
        			  }
    			  }
    			  else
    			  {
    				  System.out.println("User could not be found");
    			  }
    			  
    		  }
    		  break;
    		  
    	  case 6:
    		  if(task_obj.isEmpty())
    		  {
    			  System.out.println("no task ");
    		  }
    		  else
    		  {
    			String date;
    			System.out.println("Enter the title of the task");
    			title = sc.nextLine();
    			System.out.println("Enter the date ");
    			date = sc.nextLine();
    			task_obj.setCompletionDate(title, date);  
    		  }
    		  break;
    		  
    		  
    	  case 7:
    		  if(task_obj.isEmpty())
    		  {
    			  System.out.println("no task ");
    		  }
    		  else
    		  {
    			  task_obj.arrangeTaskInAscByDate();
    		  }
    		  
    		  break;
    		  
    	  case 8:
    		  if(task_obj.isEmpty())
    		  {
    			  System.out.println("No task");
    		  }
    		  else
    		  {
    			  task_obj.arrangeTaskInDscByDate();
    		  }
    		  
    		  break;
    		  
    		  default:
    			  System.out.println("the input is invalid");
    		  
    		  
    		  
    	   
    	  }
    	  
    	  
    	  
       }while(ch!=0);
        
        
        
        
        
     }
}
