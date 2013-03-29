package Poker;

import java.util.List;
import java.util.Scanner;

public class TheGame
{ 
	public static void main(String [] args)
	{
		
		PlayHandler handle = new StartGameHandler();
		
		System.out.println("Are you Ready to play POKER!!!!"); 
		System.out.println("If so - type 'Start'"); 
		
		Scanner scan = new Scanner(System.in);
		
		Request request = new Request(scan.next());
		
		boolean theOutput = handle.canHandle(request);
		
		
		// need to get the belwo working for the Start game handler 
		// List<iCard> dealer = Deck.getInstance().getRequestedCards(scan.nextShort());		
		//List<iCard> player =  Deck.getInstance().getRequestedCards(5);
			
		//System.out.println("Dealers hand is " +dealer);
		//	System.out.println("Players hand is " +player);
		
		
		
		
	}
}