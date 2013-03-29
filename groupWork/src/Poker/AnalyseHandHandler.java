package Poker;

public class AnalyseHandHandler extends PlayHandler {

	@Override
	public boolean canHandle(Request request) {
	String requestType = "analyseHand";
		
		if(requestType.equals(request.getRequestType())){
			
			// compare both players hands 
			System.out.println("lets compare these hands");
			return true;
			
		}else{
			return false;
		}
	}


}
