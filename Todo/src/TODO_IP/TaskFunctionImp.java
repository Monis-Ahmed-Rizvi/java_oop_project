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
	
	
}
