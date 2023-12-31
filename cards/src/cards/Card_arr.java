package cards;

import java.util.*;
import java.lang.*;



public class Card_arr {
    // prints  deck of same rank and different suits
    public static void printDeck(card[] obj)
    {
    	int index = 0; 
    	for(int i =1;i<=13;i++)
    	{
    		for(int j=0;j<=3;j++)
    		{
    			System.out.print(" "+obj[index]+" ");
    			index++;
    		}
    		System.out.println("");
    	}
    }
     
    // prints deck of same suits and different ranks
    
    
    public static void printDeck_n(card[] obj)
    {
    	int index = 0; 
    	for(int i =0;i<=3;i++)
    	{
    		for(int j=1;j<=13;j++)
    		{
    			System.out.print(" "+obj[index]+" ");
    			index++;
    		}
    		System.out.println("");
    	}
    }
    
    
    
    // search for particular card in the deck
    
    public static int DeckSearch(card[] deck,card card_obj)
    {
        for(int i =0;i<deck.length;i++)
        {
        	if(card_obj.toEquals(deck[i]))
        	{
        		return i;
        	}	
        }
    	return 0;
    }
    
    public static int DeckBinSearch(card[] deck,card target)
    {
    	int low = 0;
    	int high = deck.length -1;
    	
    	
    	// if deck[mid] is lower than target -1 deck[mid] ---- [target]
    	// if deck[mid] is higher than target 1 target ----- deck[mid]
    	while(low<=high)
    	{
    	 int mid = (low+high)/2;	
    	 int comp = deck[mid].toCompare(target);
    	 
    	 if(comp == 0)
    	 {
    		 return mid;
    	 }
    	 else if(comp < 0)
    	 {
    		 low = mid+1;
    	 }
    	 else
    	 {
    		 high = mid - 1;
    	 }
    	 
    	 System.out.println(low+" : "+high+" : "+mid+" : "+comp);
    	}
    	
    	
    	return 0;
    }
    
    
    
	public static void main(String[] args)
	{
	   // creating a new card array 
	   // contains only reference 
	   // you can not access until initialized
	       
	   Random rand = new Random();
	   card[] cards = new card[52];
	   card[] cards_2 = new card[52];
	   int randInt = rand.nextInt(51);
	   int index = 0;
	   
	   
	   // Generating decks 
	   
	   // deck of same rank and different suits
	   for(int i = 1;i<=13;i++)
	   {
		   for(int j = 0;j<=3;j++)
		   {
			   cards[index] = new card(j,i);
			   index++;
		   }
	   }
	   
	   index = 0;
	   
	   // deck of same suits and different rank
	   
	   for(int i = 0;i<=3;i++)
	   {
		   for(int j = 1;j<=13;j++)
		   {
			   cards_2[index] = new card(i,j);
			   index++;
		   }
	   } 
	   
	   
	   
	   //printDeck(cards);
	   System.out.println("");   
	   //printDeck_n(cards_2);
	
	   
	   
	   
	   
	   // creating card to search 
	   // comparing the 2 different decks  
	   for(int i = 0;i<cards.length;i++)
	   {
		   System.out.println(i+" "+cards[i]+"  "+cards_2[i]);
	   }
	   
	   
	   card card_r = cards[randInt];
	   //System.out.println(randInt);
	   //System.out.println(card_r.toString());
	   
	   
	   card cardq = new card(2,2);
	   System.out.println(cardq.toString());
	   
	   
	   // searching in both the decks 
	   //System.out.println(DeckSearch(cards,cardq));
	   //System.out.println(DeckSearch(cards_2,cardq));
	   
	   
	   System.out.println(DeckBinSearch(cards_2,cardq));
	   
	   // can not work on unsorted array 
	   //System.out.println(DeckBinSearch(cards,cardq));
	   
	}
	
}
