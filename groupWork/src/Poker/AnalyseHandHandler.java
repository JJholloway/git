package Poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnalyseHandHandler extends PlayHandler {

	@Override
	public boolean canHandle(Request request) {
		String requestType = "Analyse";

		if (requestType.equals(request.getRequestType())) {

            int dealerScore = iCard.analyseHand(Deck.getDealerCards());
            int playerScore = iCard.analyseHand(Deck.getPlayerCards());

            System.out.println("which cards do you want to replace? (type comma separated index, such as 0,1,2)");

            PlayService service = new PlayService();
            Scanner scan1 = new Scanner(System.in);



            Request request1 = new Request("Results");
            request1.setResult(playerScore);
            request1.setDealerResult(dealerScore);

            service.playerRequest(request1);



			/*int playerCount = 0;
			int dealerCount = 0;
			String playerResult = "";
			String dealerResult = "";
			int intPlayerResult = 0;
			int intDealerResult =0;
			List<iCard> dealer = Deck.getInstance().getDealerCards();
			List<iCard> player = Deck.getInstance().getPlayerCards();
			ArrayList<String> dealer1 = new ArrayList<String>();
			ArrayList<String> player1 = new ArrayList<String>();
			ArrayList<String> ans = new ArrayList<String>();

			// compare both players hands
			System.out.println("lets compare these hands");

			// lets save both of the hands into a local list

			String dealer2 = dealer.toString();

			if (dealer2.contains("2")) {
				System.out.println("true");
			}

			// Lets get the first value of each entry for the dealer
			dealer1.add(dealer.get(0).toString().substring(0, 1));
			dealer1.add(dealer.get(1).toString().substring(0, 1));
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

			// player1.retainAll("A"))

			System.out.println(dealer1);

			System.out.println(player1);

			// i amgoing to do this the old school 'bruit force' for loop way
			// but i am sure that there is a better way....
			// also this will only work for: pair, two pair, three of a kind
			// (could also work for straight)
			// flush -- hmmm

			// to compare for a pair or two pair
			for (int i = 0; i < player1.size() - 1; i++) {
				String a = player1.get(i);
				for (int j = i + 1; j < player1.size(); j++) {
					String b = player1.get(j);
					if (a.equals(b)) {
						playerResult = "player has a pair!";
						playerCount++;
						intPlayerResult =1;

						if (playerCount > 1 && playerCount < 3) {
							playerResult = ("player two pair!");
							intPlayerResult =2;
						}
						if (playerCount > 2) {
							playerResult = "player has three of a kind!";
							intPlayerResult =3;

						}
						if (playerCount > 3) {
							playerResult = "player has four of a kind!";
							intPlayerResult =4;

						}
					}

				}
			}

			for (int i = 0; i < dealer1.size() - 1; i++) {
				String c = dealer1.get(i);
				for (int j = i+1; j < dealer1.size(); j++) {
					String d = dealer1.get(j);

					if (c.equals(d)) {
						dealerResult = "dealer has a pair!";
						dealerCount++;
						intDealerResult =1;

						if (dealerCount > 1 && dealerCount < 3) {
							dealerResult = ("dealer two pair!");
							intDealerResult =2;
						}
						if (dealerCount > 2) {
							dealerResult = "dealer has three of a kind!";
							intDealerResult =3;

						}
						if (dealerCount > 3) {
							dealerResult = "dealer has four of a kind!";
							intDealerResult =4;

						}
					}

				}

			}

			System.out.println(dealerResult);
			System.out.println(playerResult);
			
			
			
			// lets compare the values
			// starting off trying to find a pair
			
			
			System.out.println(""); 
			System.out.println("OOOOOOOO"); 
			System.out.println("Type 'Result' to confirm your joyious sucess or fate!"); 
			
			PlayService service = new PlayService();
			
			Scanner scan1 = new Scanner(System.in);
				
			Request request1 = new Request(scan1.next());
			request1.setResult(intPlayerResult);
			request1.setDealerResult(intDealerResult);
				
			service.playerRequest(request1);*/

			return true;

		} else {
			return false;
		}
	}

}
