package Poker;

import java.util.ArrayList;
import java.util.List;

public class AnalyseHandHandler extends PlayHandler {

	@Override
	public boolean canHandle(Request request) {
	String requestType = "Analyse";
		
		if(requestType.equals(request.getRequestType())){
			
			// compare both players hands 
			System.out.println("lets compare these hands");
			
			
			// lets save both of the hands into a local list 
			List<iCard> dealer = Deck.getInstance().getDealerCards();
			List<iCard> player = Deck.getInstance().getPlayerCards();
			
		
			
			String dealer2 = dealer.toString();
			
			if(dealer2.contains("Hearts")){
				System.out.println("true");
			}
			
			ArrayList<String> dealer1 = new ArrayList<>();
			ArrayList<String> player1 = new ArrayList<>();
			
			// Lets get the first value of each entry for the dealer
			dealer1.add(dealer.get(0).toString().substring(0, 1));
			dealer1.add (dealer.get(1).toString().substring(0, 1));
			dealer1.add(dealer.get(2).toString().substring(0, 1));
			dealer1.add(dealer.get(3).toString().substring(0, 1));
			dealer1.add(dealer.get(4).toString().substring(0, 1));
			
			// do the same for the player 
			player1.add(player.get(0).toString().substring(0, 1));
			player1.add(player.get(1).toString().substring(0, 1));
			player1.add(player.get(2).toString().substring(0, 1));
			player1.add(player.get(3).toString().substring(0, 1));
			player1.add(player.get(4).toString().substring(0, 1));
			
			// put all the five into a ArrayList<String>
			
			System.out.println(dealer1);
			
			System.out.println(player1);
			
			// i amgoing to do this the old school 'bruit force' for loop way but i am sure that there is a better way....
			// also this will only work for: pair, two pair, three of a kind (could also work for straight)
			// flush -- hmmm
			
			
			// lets compare the values
			// starting off trying to find a pair 
			
			
			return true;
			
		}else{
			return false;
		}
	}


}
