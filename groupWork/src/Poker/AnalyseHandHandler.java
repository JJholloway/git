package Poker;

public class AnalyseHandHandler extends PlayHandler {

	@Override
	public boolean canHandle(Request request) {
	String requestType = "Analyse";
		
		if(requestType.equals(request.getRequestType())){
			
			// compare both players hands 
			System.out.println("lets compare these hands");
			
			// lets get the first char substring of all the hands
			// this is because i cannot find how to get the number values 
			// there will be the following beging values A,J,Q,K,2,3,4,5,6,7,8,9,1
			// 1 ==10 
			
			
			
			
			
			return true;
			
		}else{
			return false;
		}
	}


}
