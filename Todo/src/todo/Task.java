package todo;

public class Task {
     private int taskId;
     private String taskTitle;
     private String taskText;
     private String assignedTo ;
     
     // constructor 
     
     
     Task()
     {
    	 super();
     }
     
     
     Task(int taskId,String taskTitle,String taskText)
     {
    	 
    	 this.taskId = taskId;
    	 this.taskTitle = taskTitle;
    	 this.taskText = taskText;
    	 
     }
     
     
     // getter 
     
     
     public int getId()
     {
    	 return this.taskId;
     }
     
     
     public String getTitle()
     {
    	 return this.taskTitle;
    	 
     }
     
     
     public String getText()
     {
    	 return this.taskText;
     }
     
     
     public String getAssign()
     {
    	 return this.assignedTo;
     }
     
     
     // setter 
     
     
     public void setTitle(String title)
     {
    	 this.taskTitle = title;
     }
     
     
     
     public void setId(int id)
     {
    	 this.taskId = id;
    	 
     }
     
     
     public void setText(String text)
     {
    	 this.taskText = text;
     }
     
     
     
     public void setAssign(String assign)
     {
    	 this.assignedTo = assign;
     }
     
     
     // toString Display
     
     @Override
     public String  toString()
     {
    	 return "Task [taskId=" + this.taskId+ ", taskTitle=" + this.taskTitle+ ", taskText "+this.taskText +", task Assigned to "+ this.assignedTo +"]";
     }
     
     
}
