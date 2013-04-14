package EX1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class onButton {
	
	
	 public static void convertAction (ActionEvent evt) {
		  // i have to put my old main methos code in here 
		 Scanner scan = new Scanner(System.in);
		 
		String Q = GUI.getField1();
		

		 while(scan.hasNext()) {
		  
		  
			 if (scan.hasNextInt()){ 
				 int input = scan.nextInt();
		 
		  
				 if (input <0 || input >9999){
					 System.out.println(" WOA hold steady now partner... lets have a value between 0 and 9999"); 
					 // have another input for them to put another value in 
					 	input = scan.nextInt();
			  
				 }
		  
		  // lets see if the number is in the thousands 
		  if(input >=1000 && input<=9999){
			  int t = input/1000;
			  Thousands.thousands(t);
			  input = input -(t*1000);
		  }
			  if(input >=100 && input <=999){
		            int h = input/100;
		            Hundreds.hundreds(h);
		            input = input -(h*100);
			  }
		  
			  if(input >=20 && input <=99){
		            int ten = input/10;
		            Tens.tens(ten);
		            input = input -(ten*10);
		            
			  }
			  
			  if(input >=10 && input <=19){
				  int teen = input;
				  Teens.teens(teen);
				  
			  }
			  
			  if(input >=0 && input <=9){
		            int ten = input;
		            Units.units(ten);
			  }
			  
			
			  
			 
			  
	  
		  //now lets anayise the input - this will involve figuring it out whether it is a thousand, hundred, tens, units
		  // but not that there is also the troubled teens 
		  // and for every thousands, hundreds, tens and units we need to have a switch call that will look at the value and match it to the 
		  // correct case value
		  
	  
		  // this is my first method for and is for the thousands number 
		  // I am making a method call thouands and using swith - case to compare the values 
		  // note - there should not be a need for the use of default because all should have an answer
		  //- if this is not the case then my if statements above are wrong
	  
	  // 
	}
			
			  
	  if (!scan.hasNextInt()){
		  System.out.print(scan.next() + " ");
	  
		   //System.out.print(scan.next());
	  }
	  
	  }
		  
		  
	  }

}
