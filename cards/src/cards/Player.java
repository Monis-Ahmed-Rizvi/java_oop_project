package cards;

public class Player {

	private String name;
	private hand hand_obj;
	
	Player(String name)
	{
		this.name = name;
		this.hand_obj = new hand(name);
		
	}
	
	
	public card play(Eights eights,card prev)
	{
		card card_obj = searchForMatch(prev);
		if(card_obj == null)
		{
			card_obj = drawForMatch(eights,prev);
		}
		return card_obj;
	}
	
	
	public hand getHand()
	{
		return this.hand_obj;
	}
	
	public String getName()
	{
		return name;
	}
	
	public card searchForMatch(card prev)
	{
		for(int i =0;i<hand_obj.size();i++)
		{
			card card_obj = hand_obj.getCard(i);
			if(cardMatches(card_obj,prev))
			{
				return hand_obj.removeCard(i);
			}
		}
		return null;
	}
	
	public card drawForMatch(Eights eights,card prev)
	{
		while(true)
		{
			card card_obj = eights.draw();
			String cardStr = card_obj.toString();
			System.out.println(name+" draws "+cardStr);
			if(cardMatches(card_obj,prev))
			{
				return card_obj;
			}
			
			hand_obj.addCard(card_obj);
			
		}
	}
	
	
	
	public static boolean cardMatches(card card1,card card2)
	{
		if(card1.getSuit() == card2.getSuit())
		{
			return true;
		}
		if(card2.getRank() == card2.getRank())
		{
			return true;
		}
		if(card1.getRank() == 8)
		{
			return true;
		}
		return false;
	}
	
	
	public int score()
	{
		int sum = 0;
		for(int i =0;i<hand_obj.size();i++)
		{
			card card_obj = hand_obj.getCard(i);
			int rank = card_obj.getRank();
			if(rank == 8)
			{
				sum -= 20;
			}
			else if(rank > 10)
			{
				sum -= 10;
			}
			else
			{
				sum -= rank;
			}
			
		}
		
		return sum;
	}
	
	
	public void display() {
		hand_obj.display();
	}
	
	public void displayScore()
	{
		System.out.println(name+" has "+score()+" Point ");
	}
	
}
