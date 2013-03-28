package Poker;

import java.util.List;

public class TheGame
{ 
	public static void main(String [] args)
	{
		List<iCard> deck = Deck.getInstance().getRequestedCards(5);
		for(int i=0; i<deck.size(); i++)
			System.out.println(deck.get(i).toString());
	}
}