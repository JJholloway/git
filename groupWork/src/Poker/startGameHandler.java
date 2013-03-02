package Poker;

public class startGameHandler extends PlayHandler {
	
	
	@Override
	public boolean canHandle(Request request) {

		String requestType = "startGame";
		
		if(requestType.equals(Request.getRequestType())){
			
			//Load cards 
			//Shuffle cards 
			
			return true;
			
		}else{
			return false;
		}
	}

	

	


}
