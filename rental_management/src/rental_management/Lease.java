package rental_management;

import java.time.LocalDate;

public class Lease {

	
	private Resident resident;
	private int id;
	private LocalDate moveInDate;
	private LocalDate moveOutDate;
	private property property_obj;
	
	public Lease(Resident resident,int id,LocalDate moveInDate,LocalDate moveOutDate,property property)
	{
		this.resident = resident;
		this.id = id;
		this.moveInDate = moveInDate;
		this.moveOutDate = moveOutDate;
		this.property_obj = property;
	}
	
	public Resident getResident() {
		return resident;
	}
	
	public void setResident(Resident resident)
	{
		this.resident = resident;
	}
	
	
	public int getId()
	{
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public LocalDate getMoveInDate()
	{
		return moveInDate;
	}
	
	public void setMoveInDate(LocalDate moveInDate)
	{
		this.moveInDate = moveInDate;
	}
	
	
	public LocalDate getMoveOutDate()
	{
		return moveOutDate;
	}
	
	
	public void setMoveOutDate(LocalDate moveOutDate)
	{
		this.moveOutDate = moveOutDate;
	}
	
	
	public property getProperty()
	{
		return property_obj;
	}
	
	
	public void setProperty(property property_obj)
	{
		this.property_obj = property_obj;
	}
	
	
}
