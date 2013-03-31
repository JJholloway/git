/*	If you like to gamble, I tell you I'm your man
	You win some, lose some, it's - all - the same to me
	The pleasure is to play, it makes no difference what you say
	I don't share your greed, the only card I need is
	The Ace Of Spades
	The Ace Of Spades	*/
package Poker;


import java.util.*;
import java.util.Map.Entry;

public abstract class iCard {
	private int number;
	private String suit;

	public iCard(int n){
		number = n;
	}

    protected void setSuit(String psuit){ suit = psuit; }

	public String toString(){ 
		String numpart;

		switch(number){
			case 1: numpart = "Ace"; break;
			case 11: numpart = "Jack"; break;
			case 12: numpart = "Queen"; break;
			case 13: numpart = "King"; break;
			default: numpart = number + "";
		}
		return numpart + " of " + suit;
	}
	
	
	// we need a section in the interface that will return the int value of the card so we use this for comparison 
	public int getValue(){
		return number;
	}
    public String getSuit(){
        return suit;
    }

    static public int analyseHand(List<iCard> list)
    {
        Map<Integer,Integer> numbers = new LinkedHashMap<Integer, Integer>();
        Map<String,Integer> suits = new LinkedHashMap<String, Integer>();

        for(int i=0; i<list.size(); i++)    {
            numbers.put(list.get(i).getValue(), numbers.containsKey(list.get(i).getValue()) ? numbers.get(list.get(i).getValue()) + 1 : 1);
            suits.put(list.get(i).getSuit(), suits.containsKey(list.get(i).getSuit()) ? suits.get(list.get(i).getSuit()) + 1 : 1);
        }

        Iterator entries = numbers.entrySet().iterator();
        //four of a kind
        if(((Integer) ((Entry)entries.next()).getValue()) > 3 || ((Integer) ((Entry)entries.next()).getValue()) > 3)
            return 500;
        //a flush
        entries = suits.entrySet().iterator();
        if(((Integer) ((Entry)entries.next()).getValue()) == 5)
            return 400;

        if(isSequence(list))
            return 300;

        int score = 0;
        for(Map.Entry<Integer, Integer> entry : numbers.entrySet())
        {
            if(entry.getValue() == 3)
                score += 200 + entry.getKey();
            else if(entry.getValue() == 2)
                score += 100 + entry.getKey();
        }
        return score;
    }
    static private boolean isSequence(List<iCard> list)
    {
        return false;
    }
}