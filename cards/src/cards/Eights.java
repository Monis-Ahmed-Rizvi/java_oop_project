package cards;

import java.util.Scanner;

public class Eights {

	
	private Player one;
	private Player two;
	private hand drawPile;
	private hand discardPile;
	private Scanner in;
	
	
	public Eights() {
		deck_c deck = new deck_c("Deck");
		deck.shuffle();
		
		int handSize = 5;
		one = new Player("Monis");
		deck.deal(one.getHand(), handSize);
		
		two = new Player("nobit");
		deck.deal(two.getHand(),handSize);
		
		discardPile = new hand("discardPile");
		deck.deal(discardPile,1);
		
		drawPile = new hand("draw pile");
		deck.dealAll(drawPile);
		
		in = new Scanner(System.in);
		
	}
	
	public boolean isDone()
	{
		return one.getHand().isEmpty() || two.getHand().isEmpty();
	}
	
	public void reshuffle() {
		card prev = discardPile.removeCard();
		// takes all  cards from discard pile and add the cards in draw pile
		discardPile.dealAll(drawPile);
		// saves the last card and adds it back in discard pile 
		discardPile.addCard(prev);
		
		drawPile.shuffle();
	}
	
	public card draw()
	{
	   if(drawPile.isEmpty())
	   {
		   reshuffle();
		   
	   }
	   return drawPile.removeCard();	
	}
	
	public Player nextPlayer(Player current) {
		if(current == one)
		{
			return two;
		}
		else
		{
			return one;
		}
	}
	
	public void displayState() {
		one.display();
		two.display();
		discardPile.display();
		System.out.println("Draw pile:");
		System.out.println(drawPile.size() + " cards");
	}
	 
	public void waitForUser()
	{
		in.nextLine();
	}
	
	
	public void taketurn(Player player)
	{
		card prev = discardPile.getCard();
		card next = player.play(this, prev);
		discardPile.addCard(next);
		
		System.out.println(player.getName() + " plays " + next);
		System.out.println();
	}
	
	public void playGame()
	{
		Player player = one;
		while(!isDone())
		{
			displayState();
			waitForUser();
			taketurn(player);
			player = nextPlayer(player);
			
		}
		
		
		one.displayScore();
		two.displayScore();
	}
	
	
}
