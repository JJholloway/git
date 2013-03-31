package Poker;

import java.util.*;

public class CardRequestHandler extends PlayHandler {

    @Override
    public boolean canHandle(Request request) {
        String requestType = "cardRequest";

        if(requestType.equals(request.getRequestType())){

            System.out.println("which cards do you want to replace, up to 3 cards? (type comma separated index, such as 0,1,2)");
            PlayService service = new PlayService();
            Scanner scan = new Scanner(System.in);
            String[] entries = scan.next().split(",");
            int count = (entries.length > 3 ? 3 : entries.length);
            List<iCard> remove = new ArrayList<iCard>();
            for(int i=0; i<count; i++)
            {
                remove.add(Deck.getPlayerCards().get(Integer.parseInt(entries[i])));
            }
            for(int i=0; i<count; i++)
            {
                Deck.getPlayerCards().remove(remove.get(i));
                Deck.getPlayerCards().add(Deck.getInstance().getCard());
            }
            Request request1 = new Request("Result");
            CardEvaluator eval = new CardEvaluator();
            int playerScore = eval.analyse(Deck.getPlayerCards());
            request1.setResult(playerScore);
            service.playerRequest(request1);

            return true;

        }else{
            return false;
        }
    }
}