package Poker;

public class AnalyseHandHandler extends PlayHandler {

	@Override
	public boolean canHandle(Request request) {
		String requestType = "Analyse";

		if (requestType.equals(request.getRequestType())) {

            Request request1 = new Request("cardRequest");
            CardEvaluator eval = new CardEvaluator();

            int dealerScore = eval.analyse(Deck.getDealerCards());
            eval.replaceDealersCards();
            dealerScore = eval.analyse(Deck.getDealerCards());
            request1.setDealerResult(dealerScore);

            PlayService service = new PlayService();
            service.playerRequest(request1);

			return true;
		} else {
			return false;
		}
	}
}
