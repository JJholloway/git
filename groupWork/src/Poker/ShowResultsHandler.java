package Poker;

public class ShowResultsHandler extends PlayHandler {

	@Override
	public boolean canHandle(Request request) {
	String requestType = "Result";
		
		if(requestType.equals(request.getRequestType())){
			
			System.out.println("Drum rool please");
			System.out.println("The result is.........");
		//display results 
			
			if(Request.getPlayerResult() > Request.getDealerResult()){
				System.out.println("YOU ARE A WINNER!!!!!!!!!!!");
			}else {
				System.out.println("LOOOOOOOOOOOOOOOOOSER!!!");
			}
			
			return true;
			
		}else{
			return false;
		}
	}

}
