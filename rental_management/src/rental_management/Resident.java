package rental_management;

public class Resident {

	private int socialId;
	private String firstName;
	private String lastName;
	
	public Resident(int socialId,String firstName,String lastName)
	{
		
		this.socialId = socialId;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	
	public int getSocialId()
	{
		return this.socialId;
	}
	
	
	public void setSocialId(int socialId)
	{
		this.socialId = socialId;
	}
	
} 
