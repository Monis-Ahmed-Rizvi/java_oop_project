package cards;

public class deck_c extends CardCollection  {

		public deck_c(String label) {
			super(label);
	        for(int suit = 0;suit <=3;suit++)
	        {
	        	for(int rank = 1;rank <= 13;rank++)
	        	{
	        		cards.add(new card(suit,rank));
	        	}
	        	
	        }
		}
		
		
		
}


