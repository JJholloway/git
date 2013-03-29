package Poker;

import java.util.List;

public class TheGame
{ 
	public static void main(String [] args)
	{
		//List<iCard> deck = Deck.getInstance().getRequestedCards(5);
		
		
		//for(int i=0; i<deck.size(); i++){
			
			//System.out.println(deck.get(i));//.toString());
		//	}
		
		// need to get the belwo working for the Start game handler 
		   List<iCard> dealer = Deck.getInstance().getRequestedCards(5);		
			List<iCard> player =  Deck.getInstance().getRequestedCards(5);
			
			System.out.println("Dealers hand is " +dealer);
			System.out.println("Players hand is " +player);
		
		
		
		
	}
}