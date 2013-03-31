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

            PlayService service = new PlayService();
			service.playerRequest(new Request("Analyse"));
			return true;
		}else{
			return false;
		}
	}

	

	


}
