/*	If you like to gamble, I tell you I'm your man
	You win some, lose some, it's - all - the same to me
	The pleasure is to play, it makes no difference what you say
	I don't share your greed, the only card I need is
	The Ace Of Spades
	The Ace Of Spades	*/
package Poker;

public abstract class iCard {
	private int number;
	private String suit;

	public iCard(int n){
		number = n;
	}

    protected void setSuit(String psuit){ suit = psuit; }

	public String toString(){ 
		String numpart;

		switch(number){
			case 1: numpart = "Ace"; break;
			case 11: numpart = "Jack"; break;
			case 12: numpart = "Queen"; break;
			case 13: numpart = "King"; break;
			default: numpart = number + "";
		}
		return numpart + " of " + suit;
	}
}