package rental_management;

public class RowHouse extends property implements RentCalculator {
	
	protected int storeys;
	protected int backyardSize;
	protected int frontyardSize;
	
	public RowHouse(Address address, int storeys, int backyardSize, int frontyardSize)
	{
		super(address);
		this.storeys = storeys;
		this.backyardSize = backyardSize;
		this.frontyardSize = frontyardSize;
	}
	
	@Override
	public int calculateRent(int pricePerSqFeet)
	{
		return (frontyardSize + backyardSize) * storeys * pricePerSqFeet;
	}
	
	
	@Override
	int  calculatePropertyTax(int pricePerSqFeet)
	{
		return (frontyardSize + backyardSize) + pricePerSqFeet;
	}
	
	public int getStoreys()
	{
		return storeys;
	}
	
	
	public void setStoreys(int storeys)
	{
		this.storeys = storeys;
	}
	
	public int getBackyardSize()
	{
		return this.backyardSize ;
		
	}
	
	
	public void setBackyardSize(int backyardSize)
	{
		this.backyardSize = backyardSize;
		
	}
	
	
	public int getFrontyardSize()
	{
		return this.frontyardSize;
	}
	
	public void setFrontyardSize(int frontyardSize)
	{
		 this.frontyardSize = frontyardSize;
	}
	
	
	
	
    
}
