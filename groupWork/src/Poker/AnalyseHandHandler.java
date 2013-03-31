package Poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnalyseHandHandler extends PlayHandler {

	@Override
	public boolean canHandle(Request request) {
		String requestType = "Analyse";

		if (requestType.equals(request.getRequestType())) {

            Request request1 = new Request("Result");
            CardEvaluator eval = new CardEvaluator();

            int dealerScore = eval.analyse(Deck.getDealerCards());
            eval.replaceDealersCards();
            dealerScore = eval.analyse(Deck.getDealerCards());
            request1.setDealerResult(dealerScore);

            int playerScore = eval.analyse(Deck.getPlayerCards());

            System.out.println("which cards do you want to replace, up to 3 cards? (type comma separated index, such as 0,1,2)");
            PlayService service = new PlayService();
            Scanner scan = new Scanner(System.in);
            String[] entries = scan.next().split(",");
            int count = (entries.length > 3 ? 3 : entries.length);
            for(int i=0; i<count; i++)
            {
                Deck.getPlayerCards().remove(Integer.parseInt(entries[i]));
                Deck.getPlayerCards().add(Deck.getInstance().getCard());
            }
            request1.setResult(playerScore);
            service.playerRequest(request1);

			return true;

		} else {
			return false;
		}
	}
}
