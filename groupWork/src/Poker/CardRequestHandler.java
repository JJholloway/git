package Poker;

public class CardRequestHandler extends PlayHandler {

	@Override
	public boolean canHandle(Request request) {
	String requestType = "cardRequest";
		
		if(requestType.equals(request.getRequestType())){
			
			//System.out.println("You have requested " + request.getRequestedCards() + " cards");
			
			return true;
			
		}else{
			return false;
		}
	}

	
}
