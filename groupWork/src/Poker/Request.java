package Poker;

//This class will have all of the information from each GUI request � each different request should be assign a request type; this was it will make it easier for the handlers in the chain 

public class Request {

	// lets create some private variables:
	private String requestType; 
	private static int playerResult; 
	private static int dealerResult;
	
	// have the constructor take in the above variables
	// note - null can always be passed in if that value in not needed for the request 
	
	public Request (String requestType){
		this.requestType = requestType;
	}

	public String getRequestType() {
		return requestType;
	}
	
	public static int getPlayerResult() {
		return playerResult;
	}

	public void setResult(int playerResult) {
		this.playerResult = playerResult;
	}

	public static  int getDealerResult() {
		return dealerResult;
	}

	public  void setDealerResult(int dealerResult) {
		this.dealerResult = dealerResult;
	}
}
