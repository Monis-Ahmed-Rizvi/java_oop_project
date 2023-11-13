package cards;

import java.util.*;
import java.lang.*;
public class Deck {

	private card[] cards;
	
	Deck(int x)
	{
	   this.cards = new card[x];	
	}
	
	Deck()
	{
		// Generate standard deck of 52 cards
		this.cards = new card[52]; 
		int index = 0;
		   
		   // deck of same suits and different rank
		   
		   for(int i = 0;i<=3;i++)
		   {
			   for(int j = 1;j<=13;j++)
			   {
				   this.cards[index] = new card(i,j);
				   index++;
			   }
		   } 
		
	
	}
	
	void  printDeck()
	{
	    int index = 0; 
	    for(int i =0;i<=3;i++)
	    {
	    		for(int j=1;j<=13;j++)
	    		{
	    			System.out.print(" "+this.cards[index]+" ");
	    			index++;
	    		}
	    		System.out.println("");
	    }
	 }
	
	void printDeckSimple()
	{
		System.out.println("");
		for(int i =0;i<this.cards.length;i++)
		{
			System.out.print(" "+this.cards[i]+" ");
		}
		
	}
	
	
	
	
	
    void shuffle()
    {
    	Random randInt = new Random();
    	int n = this.cards.length;
    	for(int i =0;i<this.cards.length;i++)
    	{
    		
    	  int rand =  i + randInt.nextInt(n-i);	
    	  card swap = this.cards[rand];
    	  this.cards[rand] = this.cards[i];
    	  this.cards[i] = swap;
    	  
    	}
    	
    	//System.out.println(this.cards.length);
    	//System.out.println(Arrays.toString(this.cards));
    	
    }
    // check if the shuffled array has any duplicates 
    void dup(Deck d)
    {
    	
    	card[] arr = d.cards;
    	int[] hash_k = new int[arr.length];
    	// take a card from the shuffle deck
    	for(int i =0;i<arr.length;i++)
    	{
    	    card target = this.cards[i];
    		// serach the card in og deck
    		int updex = Card_arr.DeckSearch(arr,target);
    		hash_k[updex]++;
    	}
    	
    	//System.out.println(Arrays.toString(hash_k));
    	//System.out.println(hash_k.length);
    	
    	
    }
    
    // selection sort implementation for deck
    
    void selSort()
    {
    	for(int i =0;i<this.cards.length;i++)
    	{
		int low_index = i;
		for(int j = i +1;j<this.cards.length;j++)
		{
			if(this.cards[low_index].toCompare(this.cards[j]) > 0)
			{
				low_index = j;
			}
		}
		
		//System.out.println(low_index+" "+i);
		card temp_low = this.cards[i];
		this.cards[i] = this.cards[low_index];
		this.cards[low_index] = temp_low;
		
    	}
			
    }
    
   
    Deck subdeck(int low , int high) 
    {
    	
    	
    	Deck sub = new Deck(high-low+1);
        for(int i =0;i<sub.cards.length;i++)
        {
        	sub.cards[i] = this.cards[low+i];
        }
    	return sub;
    }
    
    Deck merge(Deck d1,Deck d2)
    {
    	
        System.out.println(d1.cards.length);
        System.out.println(d2.cards.length);
    	int int_length = d1.cards.length + d2.cards.length;
    	System.out.println(int_length);
    	Deck res = new Deck(int_length);
    	int i =0;
    	int j =0;
    	
    	for(int k =0;k<res.cards.length;k++)
    	{
    		
    		System.out.println(i+" "+j+"k"+k);
    		if (i >= d1.cards.length) {
                // All elements from d1 have been used, copy remaining from d2
                res.cards[k] = d2.cards[j];
                j++;
            } else if (j >= d2.cards.length) {
                // All elements from d2 have been used, copy remaining from d1
                res.cards[k] = d1.cards[i];
                i++;
            } else {
                // Compare and copy from d1 or d2
                if (d1.cards[i].toCompare(d2.cards[j]) < 1) {
                    res.cards[k] = d1.cards[i];
                    i++;
                } else {
                    res.cards[k] = d2.cards[j];
                    j++;
                }
            }
    		
    		res.printDeckSimple();
    		
    	}
    	
    	return res;
    }
	
	
	
}
