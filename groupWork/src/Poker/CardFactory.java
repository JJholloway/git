package Poker;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class CardFactory{

	public static List<iCard> getDeck()
	{	
		List<iCard> deck = new ArrayList<iCard>();
		for(int i=1; i<14; i++)
            deck.add(new SpadesCard(i));
		for(int i=1; i<14; i++)
            deck.add(new ClubsCard(i));
		for(int i=1; i<14; i++)
            deck.add(new DiamondsCard(i));
		for(int i=1; i<14; i++)
            deck.add(new HeartsCard(i));
	
		Collections.shuffle(deck);
		return deck;
	}
}
