package TODO_IP;



public interface TaskFunction {
	boolean assignTask(String title,String user);
	boolean addTask(Task t);
	boolean removeTask(int taskId);
	Task searchTask(int taskId);
	boolean updateTask(Task task_obj);
	Task[] getAllTasks();
	boolean isEmpty();
	boolean isFull();
}
