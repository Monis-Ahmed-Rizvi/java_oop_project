package todo;
import java.util.*;
public class arr_idea {

	public static void main(String[] args)
	{
		
		String[] tasks =  new String[5];
		String task,newTask,oldTask;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		boolean flag = true;
		
		do {
			
			
			System.out.println(" 1 Add task ");
			System.out.println(" 2 update task ");
			System.out.println(" 3 delete task ");
			System.out.println(" 4 Search task ");
			System.out.println(" 5 diplay task ");
			System.out.println(" 0 Exit ");
			
			
			ch = sc.nextInt();
			
			
			
			switch(ch) {
			
				case 0:
				 System.out.println("exit.....");
				 break;
				
				case 1:
					if(cnt == 5)
					{
						System.out.println(" Array Overflow ");
					}
					else
					{
						System.out.println(" Enter a task ");
						task = sc.next();
						tasks[cnt] = task;
						cnt++;
						System.out.println(" task entred ");
					}
					
					break;
					
				case 2:
					if(cnt == 0)
					{
						System.out.println(" Array Overflow ");
					}
					else
					{
						flag = true;
						System.out.println("Enter the task to Update");
						oldTask = sc.next();
						System.out.println("Enter the new task to Update");
						newTask = sc.next();
						
						for(int i =0;i<cnt;i++)
						{
							
							if(tasks[i]!=null && oldTask.equals(tasks[i]))
							{
								tasks[i] = newTask;
								flag = false;
								break;
							}
							
							
						}
						if(flag == true)
						{
							System.out.println("Task not found ");
						}
						else if(flag ==  false)
						{
							System.out.println(" task updated ");
						}
					}
					
					break;
					
					
				case 3:
					if(cnt == 0)
					{
						System.out.println("Array underflow");
					}
					else
					{
						flag = true;
						System.out.println("Enter the task to delete");
						task = sc.next();
						for(int i =0;i<cnt;i++)
						{
							if(tasks[i].equals(task))
							{
								tasks[i] = null;
								flag = false;
								break;
							}
						}
						if(flag == false)
						{
							System.out.println(" task deleted ");
						}
						else if(flag == true)
						{
							System.out.println(" task not found ");
						}
					}
					break;
					
				case 4:
				    if(cnt == 0)
				    {
				    	System.out.println("array empty");
				    }
				    else
				    {
				    	System.out.println("Enter the task to search");
				    	task = sc.next();
				    	for(int  i = 0;i<cnt;i++)
				    	{
				    		
				    		if(tasks[i]!=null && tasks[i].equals(task))
				    		{
				    			System.out.println("task found : "+tasks[i]+" at "+(i+1));
				    		}
				    		
				    	}
				    	
				    	
				    }
					break;
				case 5:
					for(int i = 0;i<cnt;i++)
					{
						System.out.println(i+" task "+tasks[i]);
					}
					
					break;
					
			
				 
				default:
				 System.out.println("wrong input");
				 break;   
			 
			}
			
			
			System.out.println("");
			
		}while(ch!=0);
		
	}
	
	
}
