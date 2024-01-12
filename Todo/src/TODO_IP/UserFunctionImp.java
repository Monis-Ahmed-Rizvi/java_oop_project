package TODO_IP;

public class UserFunctionImp implements Userfuntion  {
	
	private int userCnt ;
	private User[] users; 
	
	
	UserFunctionImp()
	{
	   userCnt = 0;	
       users = new User[5];
	}
	
	public boolean isEmpty()
	{
		if(userCnt==0)
		{
			return true;
		}
		return false;
	}
	
	
	public boolean isFull()
	{
		if(userCnt==5) {
		 return true;
		}
		
		return false;
	}
	
	
	public boolean isUserExist(String Email)
    {
    	if(isEmpty())
    	{
    		System.out.println("There are no users");
    		return false;
    	}
    	
    	for(int i =0;i<userCnt;i++)
    	{
    		if(users[i]!=null && users[i].getEmail().equals(Email));
    		{
    			System.out.println("User Exists"+" Name:"+users[i].getName()+" Email:"+users[i].getEmail());
    			return true;
    		}
    	}
    	
    	return false;
    }
	
	
	
	
	
	
}
