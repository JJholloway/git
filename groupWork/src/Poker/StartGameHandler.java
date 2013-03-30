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
			
			System.out.println("Dealers hand is " +  Deck.getInstance().getDealerCards());
			System.out.println("Your hand is " +  Deck.getInstance().getPlayerCards());
			//System.out.println("Your hand is " +player);
			
			System.out.println(""); 
			System.out.println("OOO what do think of your hand?!?!"); 
			System.out.println("Type 'Analyse' to compare with the dealer"); 
			
			PlayService service = new PlayService();
			
			Scanner scan1 = new Scanner(System.in);
				
			Request request1 = new Request(scan1.next());
				
			service.playerRequest(request1);
				
			return true;
			
		}else{
			return false;
		}
	}

	

	


}
