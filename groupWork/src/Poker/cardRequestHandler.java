package Poker;

import java.util.ArrayList;
import java.util.List;

public class cardRequestHandler extends PlayHandler {

	@Override
	public boolean canHandle(Request request) {
	String requestType = "cardRequest";
		
		if(requestType.equals(request.getRequestType())){
			
			System.out.println("You have requested " + request.getRequestedCards() + " cards");
		
				
				
				
			
			return true;
			
		}else{
			return false;
		}
	}

	
}
