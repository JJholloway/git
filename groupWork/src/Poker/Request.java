package Poker;

//This class will have all of the information from each GUI request � each different request should be assign a request type; this was it will make it easier for the handlers in the chain 

public class Request {

	// lets create some private variables:
	
	private String requestType; 
	
	private int numOfCards;
	
	
	// have the constructor take in the above variables
	// note - null can always be passed in if that value in not needed for the request 
	
	public Request (String requestType, int requestedCards){
		this.requestType = requestType;
		this.numOfCards = requestedCards;
		
			
		
	}


	public String getRequestType() {
		return requestType;
	}
	
	// specify all of the getters and setters below
	public int getRequestedCards() {
		return numOfCards;
	}
	
}
