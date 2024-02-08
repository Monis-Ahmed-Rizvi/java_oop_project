package TODO_IP;
import java.util.*;
public class visitorMenu {
      TaskFunctionImp task_obj;
      UserFunctionImp User_obj;
      
      public void visitor_Menu(TaskFunctionImp task_obj,UserFunctionImp User_obj,String name)
      {
    	  Scanner sc = new Scanner(System.in);
    	  
    	  this.task_obj = task_obj;
    	  this.User_obj = User_obj;
    	  int ch = 0;
    	  String title;
    	  Task[] tasks = null;
    	  
    	  do {
    		 
    		  System.out.println("1 View all the task");
    		  System.out.println("2 Arrange Task in assending order");
    		  System.out.println("3 Arrange Task in desending order");
    		  System.out.println("4 Mark Task as completed");
    		  System.out.println("5 List complete task");
    		  System.out.println("6 List incomplete task");
    		  System.out.println("0 Logout");
    		  ch = sc.nextInt();
    		   
    		  switch(ch) {
    		  
    		     case 1:
    		    	 if(task_obj.isEmpty())
    		    	 {
    		    		 System.out.print("No task available");
    		    		 break;
    		    	 }
    		    	 tasks = task_obj.getAllTasks();
    		    	 for(Task t : tasks)
    		    	 {
    		    		 if(t!=null)
    		    		 {
    		    		 
    		    		  if(t.getAssign().equalsIgnoreCase(name)==true)
    		    		  {
    		    			 System.out.println(t.toString());
    		    		  }
    		    		 
    		    		 }
    		    	 }
    		         break;
    		         
    		     case 2:
    		    	 if(task_obj.isEmpty())
    		    	 {
    		    		 System.out.println("There are no tasks");
    		    	 }
    		    	 else
    		    	 {
    		    		 task_obj.arrangeTaskInAscByDate();
    		    	 }
    		          
    		    	 break;
    		    	 
    		     case 3:
    		    	 if(task_obj.isEmpty())
    		    	 {
    		    		 System.out.println("there are no tasks");
    		    	 }
    		    	 else
    		    	 {
    		    		 task_obj.arrangeTaskInDscByDate();
    		    	 }
    		    	 
    		    	 break;
    		    	 
    		     case 4:
    		    	 if(task_obj.isEmpty())
    		    	 {
    		    		 System.out.println("NO task exist to complete");
    		    	 }
    		    	 else
    		    	 {
    		    		 System.out.println("Enter the title of the task");
    		    		 title = sc.nextLine();
    		    		 task_obj.setTaskToComplete(title, name);
    		    	 }
    		     case 5:
    		    	 if(task_obj.isEmpty())
    		    	 {
    		    		 System.out.println("Their are no task available");
    		    	 }
    		    	 else
    		    	 {
    		    		 task_obj.dispAllCompTask(name);
    		    	 }
    		    	 break;
    		    	 
    		    	 
    		     case 6:
    		    	 if(task_obj.isEmpty())
    		    	 {
    		    		 System.out.println("Their are no task available");
    		    	 }
    		    	 else
    		    	 {
    		    		 task_obj.dispAllinCompTask(name);
    		    	 }
    		  
    		      case 0:
    		    	  System.out.println("Visitor Logout");
    		    	  break;
    		  
    		      default:
    			  System.out.println("Invalid input");
    			  break;
    		  }
    		  
    		  
    	  }while(ch!=0);
    	  
      }
      
      
}
