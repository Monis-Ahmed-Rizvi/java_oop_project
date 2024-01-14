package TODO_IP;

public class UserFunctionImp implements Userfuntion  {

	private int userCnt ;
	private User[] users; 
	
	
	UserFunctionImp()
	{
	   userCnt = 0;	
       users = new User[5];
	}
	
	@Override
	public boolean isEmpty() {
		
		if(userCnt==0)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(userCnt==5) {
			 return true;
			}
			
			return false;
		
	}

	@Override
	public boolean isUserExist(String Email) {
		// TODO Auto-generated method stub
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

	@Override
	public boolean register(User u) {
		// check space in array 
				// check if User exists
				// if not then add the object to array 
				
				if(userCnt==5)
				{
					System.out.println("Array overflow");
					return false;
				}
				
				if(isUserExist(u.getEmail()))
				{
					System.out.println("User already exist");
					return false;
				}
				else
				{
					users[userCnt] = u;
					userCnt++;
					return true;
				}
	}

	@Override
	public User login(String email, String password) {
		for(User u: users)
		{
			if(u!=null&& u.getEmail().equals(email) && u.getPassword().equals(password))
			{
				return u;
			}
		}
		return null;
		
	}
	
	public void getallUser()
	{
		for(User u: users)
		{
			if(u!=null)
			{
				System.out.println(u.toString());
			}
		}
	}

	
	
}

 

