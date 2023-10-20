package cards;

public class card {

	
	private int suit;
	private int rank;
	
	public static final String[] SUITS = {"Clubs","Diamonds","Hearts","Spade"};
	public static final String[] RANKS = {null,"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	
	// constructor for the class 
	
	public card(int suit,int rank)
	{
		this.suit = suit;
		this.rank = rank;
	}
	
	// getter method
	
	public int getSuit()
	{
		return this.suit;
	}
	
	public int getRank()
	{
		return this.rank;
	}
	
	// setter method
	
	public void setSuit(int suit)
	{
		this.suit = suit;
	}
	
	public void setRank(int rank)
	{
		this.rank = rank;
	}
	
	
	public void print()
	{
		System.out.println(RANKS[this.rank]);
		System.out.println(SUITS[this.suit]);
	}
	
	public String toString()
	{
		String s = RANKS[this.rank] + " of " + SUITS[this.suit];
		return s;
	}
	
	
}
