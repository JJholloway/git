package Poker;

public class cardRequestHandler extends PlayHandler {

	@Override
	public boolean canHandle(Request request) {
	String requestType = "cardRequest";
		
		if(requestType.equals(Request.getRequestType())){
			
			//return the request number of cards 
			
			return true;
			
		}else{
			return false;
		}
	}

	
}
