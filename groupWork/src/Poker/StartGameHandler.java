package Poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StartGameHandler extends PlayHandler {
	
	
	@Override
	public boolean canHandle(Request request) {

		String requestType = "Start";
		
		if(requestType.equals(request.getRequestType())){
			
			System.out.println("Lets start...!");
			
			// when the game starts both player1 and the dealer will get dealt 5 cards 
			//List<iCard> deck = Deck.getInstance().getRequestedCards(10);
			
			
			//scan.nextShort();
			
		    List<iCard> dealer = Deck.getInstance().getRequestedCards(5);		
			List<iCard> player =  Deck.getInstance().getRequestedCards(5);
			
			//System.out.println("Dealers hand is " +dealer);
			System.out.println("Your hand is " +player);
			
			return true;
			
		}else{
			return false;
		}
	}

	

	


}
