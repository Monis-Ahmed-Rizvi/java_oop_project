package rental_management;

import java.util.HashSet;
import java.util.Set;
import java.time.LocalDate;


public class Driver {

	public static void main(String[] args)
	{
		
		Resident john = new Resident(001,"john","Doe");
		Resident jane = new Resident(002,"Jane","Doe");
		
		Set<Resident> residents = new HashSet<>();
		residents.add(john);
		residents.add(jane);
		
		
		Address apartmentAddress = new Address("Ap01","NYC");
		property apartment = new Apartment(apartmentAddress, 3000, 2500);
		
		Address rowHouseAddress = new Address("Rh01","RH");
		property rowHouse = new RowHouse(rowHouseAddress,2,10000, 3500);
		
		LocalDate moveinDate  = LocalDate.of(2021,1,31);
		LocalDate moveOutDate  = LocalDate.of(2021,12,1);
		
		Lease lease = new Lease(john, 1, moveinDate, moveOutDate,apartment);
		
		System.out.println(rowHouse.calculatePropertyTax(500));
		
		
		
	}
	
	

	
}
