package Poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



public class Deck {

	
	private static Deck uniqueDeal = null;
	
	
	
	List<iCard> theDeck = CardFactory.getDeck();
	
	
	private Deck (){}
	
	
	// Next - return one instance of the singleton if it does not yet exist 
	
	public static Deck instance(){
		if (uniqueDeal == null){
				uniqueDeal = new Deck();
				
		}
		
		return uniqueDeal;
		
	}
	
	
	
	
	public static List<iCard> getRequestedCards(int numOfCards){
		List<iCard> cardsToSend = new ArrayList<iCard>();
		
		for(int i =0; i < numOfCards; i++){
			cardsToSend.add(uniqueDeal.theDeck.remove(0));
			
			
		}
		
		return cardsToSend;
		
	}	

}
