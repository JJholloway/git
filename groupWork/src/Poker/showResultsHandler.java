package Poker;

public class showResultsHandler extends PlayHandler {

	@Override
	public boolean canHandle(Request request) {
	String requestType = "results";
		
		if(requestType.equals(request.getRequestType())){
			
		//display results 
			
			return true;
			
		}else{
			return false;
		}
	}

}