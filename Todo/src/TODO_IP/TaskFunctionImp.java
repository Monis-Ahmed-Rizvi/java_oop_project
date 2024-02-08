package TODO_IP;

public class TaskFunctionImp implements TaskFunction {

	int cnt;
	Task[] tasks;
	
	TaskFunctionImp()
	{
		cnt = 0;
		tasks = new Task[5];
	}
	
	
	public boolean assignTask(String title,String user)
	{
		// title 
		// name
		
		if(cnt==0)
		{
			System.out.println("no task available to assign");
			return false;
		}
		
		
		for(Task t:tasks)
		{
			if(t!=null && t.getTitle().equalsIgnoreCase(title))
			{
				t.setAssign(user);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean addTask(Task t) {
		if(cnt==5)
		{
			System.out.println("Array overflow");
			return false;
		}
		tasks[cnt] = t;
		cnt++;
		return true;
	}

	@Override
	public boolean removeTask(int taskId) {
		for(Task t:tasks)
		{
			if(t.getId()==taskId)
			{
				t = null;
				return true;
			}
		}
		return false;
	}

	@Override
	public Task searchTask(int taskId) {
		for(int i =0;i<cnt;i++)
		{
			if(tasks[i].getId()==taskId)
			{
				System.out.println("Task found "+"at index"+(i+1));
				System.out.println(tasks[i].toString());
				return tasks[i];
			}
		}
		return null;
	}

	@Override
	public boolean updateTask(Task task_obj) {
		if(cnt==0)
		{
			System.out.println("No task availabe");
			return false;
		}
		for(int i = 0;i<cnt;i++)
		{
		   	if(tasks[i]!=null && tasks[i].getId() == task_obj.getId())
		   	{
		   	  tasks[i] = task_obj;
		   	  return true;
		   	}
		}
		return false;
		
	}

	@Override
	public Task[] getAllTasks() {
		return tasks;
	}

	@Override
	public boolean isEmpty() {
		if(cnt==0)
		{
			System.out.println("Array is Empty");
			return true;
		}
		else
		{
		 return false;
		}
	}

	@Override
	public boolean isFull() {
		if(cnt==5)
		{
			System.out.println("Array is full");
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	@Override
	public void dispAllCompTask(String name)
	{
		for(Task t: tasks)
		{
			if(t!=null && t.getAssign().equals(name)==true && t.getCompleted() == true)
			{
				System.out.println(t.toString());
			}
		}
	}
	
	@Override
	public void dispAllinCompTask(String name)
	{
		for(Task t : tasks)
		{
			if(t!=null && t.getAssign().equals(name)==true && t.getCompleted() == false)
			{
				System.out.print(t.toString());
			}
		}
	}
	
	
	@Override
	public void arrangeTaskInAscByDate()
	{
		for(int i = 0;i<cnt-1;i++)
		{
			for(int j = 0;j<cnt-i-1;j++)
			{
				if(tasks[j]!=null && tasks[j+1]!=null)
				{
					if(tasks[j].getCompletionDate().compareTo(tasks[j+1].getCompletionDate())<0)
					{
						Task temp = tasks[j];
						tasks[j] = tasks[j+1];
						tasks[j+1] = temp;
					}
				}
			}
		}
	}
	
	@Override 
	public void arrangeTaskInDscByDate()
	{
		for(int i = 0;i<cnt-1;i++)
		{
			for(int j = 0;j<cnt-i-1;j++)
			{
				if(tasks[j]!=null && tasks[j+1]!=null)
				{
					if(tasks[j].getCompletionDate().compareTo(tasks[j+1].getCompletionDate())>0)
					{
						Task temp = tasks[j];
						tasks[j] = tasks[j+1];
						tasks[j+1] = temp;
					}
				}
			}
		}
	}
	
	
	@Override
	public void setCompletionDate(String title,String date)
	{
		
		// getting task and compare it with the title 
		// set the date using setter 
		
		for(Task t : tasks)
		{
			if(t!=null && t.getTitle().equals(title) == true)
			{   
				t.setCompletionDate(date);
				System.out.println("Completeion date set");
				return;
			}
		}
		
		System.out.println("task not found");	
	}
	
	
	
	@Override
	public void setTaskToComplete(String title,String user)
	{
		for(Task t: tasks)
		{
			if(t!=null && t.getTitle().equals(title) == true && t.getAssign().equals(user))
			{
				t.setCompleted(true);
				System.out.println("Task set to complete ");
				return;
			}
		}
		System.out.println("Task not found");
		
	}
	
	
	
}
