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
    	  Task[] tasks = null;
    	  
    	  do {
    		 
    		  System.out.println("1 View all the task");
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
    		    		 if(t!=null&&t.getAssign().equalsIgnoreCase(name))
    		    		 {
    		    			 System.out.println(t.toString());
    		    		 }
    		    	 }
    		         break;
    		      
    		  
    		  
    		      case 0:
    		    	  System.out.println("Logout");
    		    	  break;
    		  
    		      default:
    			  System.out.println("Invalid input");
    			  break;
    		  }
    		  
    		  
    	  }while(ch!=0);
    	  
      }
      
      
}
