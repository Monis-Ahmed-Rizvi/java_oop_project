package todo;

public class Taskfunctionimp  implements Taskfunction {
    
	
	int cnt;
	Task[] tasks;
	
	Taskfunctionimp()
	{
	 tasks = new Task[5];
	 cnt = 0;
	}
	
	@Override
	public boolean assignTask(String title,String name)
	{
		if(cnt==0)
		{
			System.out.println(" No Task available");
			return false;
		}
		for(int i = 0;i<cnt;i++)
		{
			if(tasks[i]!=null && tasks[i].getTitle().equals(title)==true)
			{
				tasks[i].setAssign(name);
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public boolean addTask(Task t)
	{
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
	public boolean removeTask(int taskId)
	{
		
		if(cnt == 0)
		{
			System.out.println("Array under flow ");
			return false;
		}
		
		for(int i = 0;i<cnt;i++)
		{
			if(tasks[i]!= null && tasks[i].getId()==taskId)
			{
				tasks[i] = null;
				return true;
			}
		}		
		return false;
	}
	
	@Override
	public Task searchTask(int taskId)
	{
		Task t1 = new Task();
		
		if(cnt==0)
		{
			System.out.println("No task");
			return t1;	
		}
		for(int i =0;i<cnt;i++)
		{
			if(tasks[i]!=null && tasks[i].getId()==taskId)
			{
				System.out.println("Task Found "+tasks[i].getTitle()+" index:"+(i+1));
				return tasks[i];
			}
		}
		
	    return null;
		
	}
	
	@Override
	public boolean updateTask(Task task_obj) {
		
		if(cnt==0)
		{
			System.out.println("No task");
			return false;
		}
		
		for(int i =0;i<cnt;i++)
		{
			if(tasks[i]!= null && task_obj.getId()==tasks[i].getId())
			{
				tasks[i] = task_obj;
				return true;
			}
		}
		
		return false;
		
	}
	
	
	@Override
	public Task[] getAllTasks()
	{
		
		if(cnt==0)
		{
			System.out.println(" No task available");
			return null;
		}
		
		Task[] Irtasks = new Task[cnt];
		
		for(int i = 0;i<cnt;i++)
		{
			Irtasks[i] = tasks[i];
		}
		
		return Irtasks;	
	}
	
	@Override
	public boolean isEmpty()
	{
		if(cnt==0)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public boolean isFull()
	{	
		if(cnt==5)
		{
			return true;
		}
		else if(cnt<5)
		{
			return false;
		}
		
	    return false;
	}
	
}
