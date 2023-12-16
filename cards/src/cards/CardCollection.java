package cards;

import java.util.*;

public class CardCollection {
   
	private String label;
	protected ArrayList<card> cards;
	
	public CardCollection(String label) {
		this.label = label;
		this.cards = new ArrayList<card>();
		
		
	}
	
	
	// insert card  wrapper method
	
	public void addCard(card card_obj)
	{
		this.cards.add(card_obj);
	}
	
	
	
	
	// remove card from the given index 
	
	public card removeCard(int i)
	{
		return cards.remove(i);
	}
	
	// removes the last card 
	
	public card removeCard()
	{
		
		int i =  size() - 1;
		return cards.remove(i);
		
	}
	
	// return the size of the ArrayList 
	
	public int size()
	{
		return cards.size();
	}
	
	// check if the arrayList of cards is empty 
	
	public boolean isEmpty()
	{
	     	
		return cards.size() == 0;
	}
	
	// deal method
	
	public void deal(CardCollection that,int n)
	{
		for(int i =0;i<n;i++){
		    card x = removeCard();
		    that.addCard(x);
		}	
	}
	
	public void dealAll(CardCollection that)
	{
		int n = size(); 
		for(int i =0;i<n ;i++)
		{
			card x = removeCard();
			that.addCard(x);
		}
		
	}
	
	// print method 
	
	public void content()
	{
		for(int i = 0;i<this.cards.size();i++)
		{
			
			card x = cards.get(i);
			System.out.print(x.toString()+",");
		}
		
		System.out.println();	
	}

	
	// getcard from a particular index
	
	public card getCard(int i) {
		return cards.get(i);
	}
	
	public card getCard() {
		int i = size() - 1;
		return cards.get(i);
	}
	
	
	
	public void swap(int i,int j)
	{
		card i_swap =  cards.get(i);
		cards.set(i, cards.get(j));
		cards.set(j, i_swap);
	}
	
	
	public void shuffle() {
		Random rand = new Random();
		for(int i = size()-1;i>0;i--)
		{
			int j = rand.nextInt(i);
			swap(i,j);
		}
	}
	
	
	public String getLabel() {
		return this.label;
	}
	
	
	
	
	
}





