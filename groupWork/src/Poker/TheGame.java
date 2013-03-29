package Poker;

import java.util.List;
import java.util.Scanner;

public class TheGame
{ 
	public static void main(String [] args)
	{
		//List<iCard> deck = Deck.getInstance().getRequestedCards(5);
		
		
		//for(int i=0; i<deck.size(); i++){
			
			//System.out.println(deck.get(i));//.toString());
		//	}
		
		System.out.println("Are you Ready to play POKER!!!!"); 
		System.out.println("How many cards do you want?"); 
		
		Scanner scan = new Scanner(System.in);
		
		// need to get the belwo working for the Start game handler 
		   List<iCard> dealer = Deck.getInstance().getRequestedCards(scan.nextShort());		
			List<iCard> player =  Deck.getInstance().getRequestedCards(5);
			
			System.out.println("Dealers hand is " +dealer);
			System.out.println("Players hand is " +player);
		
		
		
		
	}
}