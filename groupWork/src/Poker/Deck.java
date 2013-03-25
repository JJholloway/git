package Poker;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// this class will only be instantiated once
//it main features will be 
// 

public class Deck {
	//create a private reference to the one and only instance of the deal class 
	
	private static Deck uniqueDeal = null;
	
	//lets create a string array that will hold all of the card names
	// time providing there will be a better way to do this!!!
	
	String[] cards = {"ACE hearts", "2 hearts","3 hearts","4 hearts","5 hearts","6 hearts","7 hearts","8 hearts","9 hearts","10 hearts","JACK hearts","QUEEN hearts","KING hearts",
			"ACE spades", "2 spades","3 spades","4 spades","5 spades","6 spades","7 spades","8 spades","9 spades","10 spades","JACK spades","QUEEN spades","KING spades",
			"ACE diamonds", "2 diamonds","3 diamonds","4 diamonds","5 diamonds","6 diamonds","7 diamonds","8 diamonds","9 diamonds","10 diamonds","JACK diamonds","QUEEN diamonds","KING diamonds",
			"ACE clubs","2 clubs","3 clubs","4 clubs","5 clubs","6 clubs","7clubs","8 clubs","9 clubs","10 clubs","JACK clubs","QUEEN clubs","KING clubs"			
	};
	
	// load this array into a string linked list 
	
	private LinkedList<String> packOfCards = new LinkedList<String>(Arrays.asList(cards));
	
	// at this stage of the design it can either be private or protected 
	// i will set it to private but if it has to determine a subclass instance then it should be changed to protected 
	
	private Deck (){}
	
	
	// Next - return one instance of the singleton if it does not yet exist 
	
	public static Deck instance(){
		if (uniqueDeal == null){
				uniqueDeal = new Deck();
				// have to shuffle the list before it it is dealt 
				Collections.shuffle(uniqueDeal.packOfCards);
		}
		
		return uniqueDeal;
		
	}
	
	// Create a method to return x number of tiles using a LinkedList 
	
/*public LinkedList<String> getCards(int numOfCards){
		
		// create a LinkedList to load into cards to send 
		LinkedList<String> cardsToSend = new LinkedList<String>();
		
		// the next for statement go through the packofCards linkedlist and add the cards at the 
		//beginning and return them to the cardsTosend LinkedList
		
		// i will update this with a better for loop!
		for(int i =0; i < numOfCards; i++){
					cardsToSend.add(uniqueDeal.packOfCards.remove(0));
		}
		
		return cardsToSend;
	}
	
	*/
	
	public static List<iCard> getRequestedCards(int numOfCards){
		List<iCard> deck1 = CardFactory.getDeck();
		
		
		for(int i =0; i < numOfCards; i++){
			deck1.get(i).toString();
			
			// We have to add a remove function 
		}
		
		return deck1;
		
	}	

}
