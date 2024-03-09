package rental_management;

public class Apartment extends property implements RentCalculator {

	
	protected int superArea;
	protected int coveredArea;
	
	
	public Apartment(Address address,int superArea, int coveredArea) {
		super(address);
		this.superArea = superArea;
		this.coveredArea = coveredArea;
	}

	
	
	
	@Override
	 int calculatePropertyTax(int pricePerSqFeet) {
		// TODO Auto-generated method stub
		return (superArea * pricePerSqFeet) * 50;
		
	}
    
	@Override
	public int calculateRent(int pricePerSqFeet) {
		return (superArea * pricePerSqFeet) +500;
		
	}
	
	
	
	
	  
	public int getSuperArea()
	{
		return superArea; 
	}
	
    public void setSuperArea(int superArea)
    {
    	this.superArea = superArea;
    }
	
    
    public int getCoveredArea() {
    	return coveredArea;
    }
    
    public void setCoveredArea(int coveredArea) {
    	this.coveredArea = coveredArea;
    }




	




    
}
