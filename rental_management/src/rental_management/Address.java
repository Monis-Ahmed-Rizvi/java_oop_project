package rental_management;

public class Address {
   
	private String housingNumber;
	private String state;
	
	public Address(String housingNumber, String state)
	{
		this.housingNumber = housingNumber;
		this.state = state;
	}
	
	
	public String getHousingNumber()
	{
		return housingNumber;
	}
	
	
	public void setHousingNumber(String housingNumber)
	{
		this.housingNumber = housingNumber;
	}
	
	
	public String getState()
	{
		return state;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	
}
