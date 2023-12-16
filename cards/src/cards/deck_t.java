package cards;

import java.util.*;
import java.lang.*;


public class deck_t {

	
	public static void main(String[] args)
	{
		
	  	Deck deck1 = new Deck();
	  	Deck comp = new Deck();
	  	
	  	deck1.printDeck();
	  	System.out.println("");
		deck1.shuffle();
		deck1.printDeck();
		System.out.println("");
		deck1.dup(comp);
		deck1.selSort();
		System.out.println("");
		deck1.printDeck();
		System.out.println("");
		
		
		// sub deck 
		Deck deck2 = new Deck();
		
		Deck sub_res = deck1.subdeck(2, 22);
		Deck sub_res2 = deck2.subdeck(25,47);
		
		sub_res.shuffle();
		sub_res2.shuffle();
		
		
		sub_res.printDeckSimple();
		sub_res2.printDeckSimple();
		System.out.println("");
		Deck res = deck1.merge(sub_res,sub_res2);
		//res.printDeckSimple();
		
	}
	
}
