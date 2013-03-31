package Poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// this class will only be instantiated once
//it main features will be 

public class Deck {
	// create a private reference to the one and only instance of the deal class
	private static Deck uniqueDeal = null;
	private List<iCard> packOfCards = null;
    private List<iCard> playerCards = null;
    private List<iCard> dealerCards = null;

	// at this stage of the design it can either be private or protected
	// i will set it to private but if it has to determine a subclass instance
	// then it should be changed to protected
	private Deck() {
	}

	// Next - return one instance of the singleton if it does not yet exist
	public static Deck getInstance() {
		if (uniqueDeal == null) {
			uniqueDeal = new Deck();
			uniqueDeal.packOfCards = CardFactory.getDeck();

			// have to shuffle the list before it it is dealt
			Collections.shuffle(uniqueDeal.packOfCards);

            uniqueDeal.playerCards = uniqueDeal.getRequestedCards(5);
            uniqueDeal.dealerCards = uniqueDeal.getRequestedCards(5);
		}

		return uniqueDeal;

	}

	private List<iCard> getRequestedCards(int numOfCards) {
		List<iCard> cardsToSend = new ArrayList<iCard>();

		for (int i = 0; i < numOfCards; i++) {
			cardsToSend.add(uniqueDeal.packOfCards.get(0));
			uniqueDeal.packOfCards.remove(0);

		}
		return cardsToSend;
	}

	public static List<iCard> getDealerCards() {
		return getInstance().dealerCards;
	}

	public static List<iCard> getPlayerCards() {
		return getInstance().playerCards;
	}
}
