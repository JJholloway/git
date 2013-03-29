package Poker;

import java.util.List;
import java.util.Scanner;

public class TheGame
{ 
	public static void main(String [] args)
	{
		
		PlayService service = new PlayService();
		
		System.out.println("Are you Ready to play POKER!!!!"); 
		System.out.println("If so - type 'Start'"); 
		
		
		Scanner scan = new Scanner(System.in);
		
		Request request = new Request(scan.next());
		
		service.playerRequest(request);
		
		System.out.println(""); 
		System.out.println("OOO what do think of your hand?!?!"); 
		System.out.println("Type 'Analyse' to compare with the dealer"); 
	    
        Scanner scan1 = new Scanner(System.in);
		
		Request request1 = new Request(scan.next());
		
		service.playerRequest(request1);
		
		
	}
}