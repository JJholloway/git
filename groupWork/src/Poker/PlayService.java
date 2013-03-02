package Poker;

//This class will receive a request. Create a instance of playHandler that equals the chain Then call the entry point in playHandler with the request

public class PlayService {
	
	public void playerRequest(Request request){
		
		PlayHandler pHandler = createHandlerChain();
		
		pHandler.processRequest(request);
		
	}

	private PlayHandler createHandlerChain() {
		
		PlayHandler theHandler = new startGameHandler();
		
		theHandler.addHandler(new cardRequestHandler());
		
		theHandler.addHandler(new analyseHandHandler());
		
		theHandler.addHandler(new showResultsHandler());
		
		return theHandler;
		
	}

}
