package Poker;

import java.util.Scanner;

public class TheGame
{ 
	public static void main(String [] args)
	{
		PlayService service = new PlayService();
		
		System.out.println("Are you Ready to play POKER!!!!");
        Request request = new Request("Start");
		
		service.playerRequest(request);
	}
}