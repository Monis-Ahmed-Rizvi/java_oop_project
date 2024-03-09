package rental_management;

public abstract class property {

	
	private Address address;
	
	public property(Address address)
	{
		this.address = address;
	}
	
	abstract int calculatePropertyTax(int  pricePersqFeet);
	
	public Address getAddress() {
		return address;
	}
	
	
	
}
