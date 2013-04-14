package EX1;


import java.util.*;

public class BBKex1 {

	public static void main (String [] args) { 

		// lets tell the user something 
		System.out.println("Inputs");
		
		// create a new scanner to take in some inputs 
		
		Scanner scan = new Scanner(System.in); 
		
		//as the user is going to input int - lets make sure that the scanner is looking for ints 
		
		int input = scan.nextInt();
		
	
	// lets create a simple programme that will work for 1-10
		if(input>=0 && input <=10){
		if (input ==0){	System.out.println("zero");}
		if (input ==1){	System.out.println("one");	}
		if (input ==2){	System.out.println("two");}
		if (input ==3){	System.out.println("three");}
		if (input ==4){	System.out.println("four");}
		if (input ==5){	System.out.println("five");}
		if (input ==6){	System.out.println("six");}
		if (input ==7){	System.out.println("seven");}
		if (input ==8){	System.out.println("eight");}
		if (input ==9){	System.out.println("nine");}		
		}
		
		if(input>=10 && input <=20){
			if (input ==10){	System.out.println("ten");}
			if (input ==11){	System.out.println("eleven");}
			if (input ==12){	System.out.println("twelve");}
			if (input ==13){	System.out.println("thirteen");}
			if (input ==14){	System.out.println("fourteen");}
			if (input ==15){	System.out.println("fifteen");}
			if (input ==16){	System.out.println("sixteen");}
			if (input ==17){	System.out.println("seventeen");}
			if (input ==18){	System.out.println("eighteen");}
			if (input ==19){	System.out.println("nineteen");}
			if (input ==20){	System.out.println("twenty");}
			
		}			
		
	}
	//System.out.println("one");
	}
	
