package cards;

import java.util.*;
import java.lang.*;
import cards.card;


public class card_o {

	
	public static void main(String[]args)
	{
		
		card clubs_queen = new card(0,12);
		clubs_queen.print();
		String res = clubs_queen.toString();
		System.out.print(res);
		System.out.println("");
		// testing toEquals and toCompare methods
		
		card ace_of_dia = new card(1,1);
		card ace_of_club = new card(0,1);
		
		
		
		System.out.println(ace_of_dia.equals(ace_of_club));
		System.out.println(ace_of_dia.toString());
		System.out.println(ace_of_club.toString());
		// diamond has priority over club
		System.out.println(ace_of_dia.toCompare(ace_of_club)); 
		
		
	}
	
	
}
