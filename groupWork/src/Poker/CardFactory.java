package Poker;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class CardFactory{

	public static iCard getCard(int number, String suit)
	{
		if(suit == "Spades")
            return new SpadesCard(number);
        else if(suit == "Clubs")
			return new ClubsCard(number);
        else if(suit == "Hearts")
			return new HeartsCard(number);
        else if(suit == "Clubs")
			return new DiamondsCard(number);

        return null;
	}

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
	
	public static List<iCard> cardValue(){
		List<iCard> value = new ArrayList<iCard>();
		
		for(int i=1; i<14; i++)
            value.get(new HeartsCard(i).getValue());
		for(int i=1; i<14; i++)
            value.get(new ClubsCard(i).getValue());
		for(int i=1; i<14; i++)
            value.get(new SpadesCard(i).getValue());
		for(int i=1; i<14; i++)
            value.get(new DiamondsCard(i).getValue());
		
		return value;
		
	}
}