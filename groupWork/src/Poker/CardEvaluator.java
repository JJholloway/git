package Poker;

import java.util.*;

public class CardEvaluator {
    private Map<Integer,Integer> numbers = null;
    private Map<String,Integer> suits = null;
    private Boolean replaceCards = false;

    public int analyse(List<iCard> list)
    {
        numbers = new LinkedHashMap<Integer, Integer>();
        suits = new LinkedHashMap<String, Integer>();
        replaceCards = false;

        for(int i=0; i<list.size(); i++)    {
            numbers.put(list.get(i).getValue(), numbers.containsKey(list.get(i).getValue()) ? numbers.get(list.get(i).getValue()) + 1 : 1);
            suits.put(list.get(i).getSuit(), suits.containsKey(list.get(i).getSuit()) ? suits.get(list.get(i).getSuit()) + 1 : 1);
        }

        Iterator entries = numbers.entrySet().iterator();
        //four of a kind
        if(((Integer) ((Map.Entry)entries.next()).getValue()) > 3 || ((Integer) ((Map.Entry)entries.next()).getValue()) > 3)
            return 500;
        //a flush
        entries = suits.entrySet().iterator();
        if(((Integer) ((Map.Entry)entries.next()).getValue()) == 5)
            return 400;

        if(isSequence(list))
            return 300;

        int score = 0;
        for(Map.Entry<Integer, Integer> entry : numbers.entrySet())
        {
            replaceCards = true;

            if(entry.getValue() == 3)
                score += 200 + entry.getKey();
            else if(entry.getValue() == 2)
                score += 100 + entry.getKey();
        }
        return score;
    }
    private boolean isSequence(List<iCard> list)
    {
        return false;
    }

    public void replaceDealersCards()
    {
        List<iCard> oldList = Deck.getDealerCards();
        List<iCard> newList = new ArrayList<iCard>();

        if(replaceCards)
        {
            int counter = 0;
            for(int i=0; i<oldList.size(); i++)
            {
                if(numbers.get(oldList.get(i).getValue()) > 1 || counter > 2){
                    newList.add(oldList.get(i));
                }
                else{
                    newList.add(Deck.getInstance().getCard());
                    counter++;
                }
            }
            Deck.setDealerCards(newList);
        }
    }
}
