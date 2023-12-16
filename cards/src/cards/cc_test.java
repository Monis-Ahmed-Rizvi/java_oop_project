package cards;

import java.util.*;



public class cc_test {

	
	public static void main(String[]args)
	{
		
		CardCollection  cc_t = new CardCollection("Gen_deck");
		
		
		for(int i =1;i<=10;i++)
		{
		   card card_i = new card(0,i);
		   cc_t.addCard(card_i);  
		}

		cc_t.content();
		
		
		CardCollection cc_t2 = new CardCollection("Deal deck"); 
		
		// testing deal method 
		
		
		//cc_t.deal(cc_t2, 5);
		
		
		
		cc_t.shuffle();
		cc_t.content();
		
		
		deck_c n_deck = new deck_c("test");
		n_deck.content();
		
	}
	
	
	
}
