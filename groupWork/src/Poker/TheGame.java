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
				
	}
}