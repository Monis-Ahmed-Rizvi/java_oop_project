package TODO_IP;

public class Task {
    private int taskId;
    private String taskTitle;
    private String taskText;
    private String assignedTo ;
    private String CompletionDate;
    private boolean completed = false;
    
    // constructor 
    
    
    Task()
    {
   	 super();
    }
    
    
    Task(int taskId,String taskTitle,String taskText)
    {
   	 super();
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
    
    
    
    
    // getter for completed;
    
     public boolean getCompleted()
     {
    	 return this.completed;
     }
    
    
    // getter for completionDate;
     
     
     public String getCompletionDate()
     {
    	 return this.CompletionDate;
     }
    
    // setter 
    
    // setter for completed;
     
     
     public void setCompleted(boolean completed)
     {
       this.completed = completed;	 
     }
     
     
     
     
    // setter for completionDate;
    
     
     public void setCompletionDate(String completionDate)
     {
    	 this.CompletionDate = completionDate;
     }
    
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
   	 return "Task [taskId=" + this.taskId+ ", taskTitle=" + this.taskTitle+ ", taskText "+this.taskText +", task Assigned to "+ this.assignedTo +",CompletionDate "+ this.CompletionDate +", Completion status "+ this.completed+"]";
    }
    
    
}
