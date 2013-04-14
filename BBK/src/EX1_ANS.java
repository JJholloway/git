

	// Program to convert integers into words, Ex5.5


	import java.util.Scanner;

	public class EX1_ANS {

	    // units Method
	    public static void units(int n) {

	        switch (n) {
	            case 1:
	                System.out.print("one ");
	                break;
	            case 2:
	                System.out.print("two ");
	                break;
	            case 3:
	                System.out.print("three ");
	                break;
	            case 4:
	                System.out.print("four ");
	                break;
	            case 5:
	                System.out.print("five ");
	                break;
	            case 6:
	                System.out.print("six ");
	                break;
	            case 7:
	                System.out.print("seven ");
	                break;
	            case 8:
	                System.out.print("eight ");
	                break;
	            case 9:
	                System.out.print("nine ");
	                break;
	        }
	    }

	    // special case Method
	    public static void special(int n) {

	        switch (n) {
	            case 11:
	                System.out.print(" eleven");
	                break;
	            case 12:
	                System.out.print(" twelve");
	                break;
	            case 13:
	                System.out.print(" thirteen");
	                break;
	            case 14:
	                System.out.print(" fourteen");
	                break;
	            case 15:
	                System.out.print(" fifteen");
	                break;
	            case 16:
	                System.out.print(" sixteen");
	                break;
	            case 17:
	                System.out.print(" seventeen");
	                break;
	            case 18:
	                System.out.print(" eighteen");
	                break;
	            case 19:
	                System.out.print(" nineteen");
	                break;
	        }
	    }

	    // tens Method
	    public static void tens(int n) {

	        switch (n) {
	            case 1:
	                System.out.print(" ten ");
	            case 2:
	                System.out.print(" twenty ");
	                break;
	            case 3:
	                System.out.print(" thirty ");
	                break;
	            case 4:
	                System.out.print(" forty ");
	                break;
	            case 5:
	                System.out.print(" fifty ");
	                break;
	            case 6:
	                System.out.print(" sixty ");
	                break;
	            case 7:
	                System.out.print(" seventy ");
	                break;
	            case 8:
	                System.out.print(" eighty ");
	                break;
	            case 9:
	                System.out.print(" ninety ");
	                break;
	        }
	    }

	    // hundreds Method
	    public static void hundreds(int n) {

	        switch (n) {
	            case 1:
	                System.out.print("one hundred ");
	                break;
	            case 2:
	                System.out.print("two hundred ");
	                break;
	            case 3:
	                System.out.print("three hundred ");
	                break;
	            case 4:
	                System.out.print("four hundred ");
	                break;
	            case 5:
	                System.out.print("five hundred ");
	                break;
	            case 6:
	                System.out.print("six hundred ");
	                break;
	            case 7:
	                System.out.print("seven hundred ");
	                break;
	            case 8:
	                System.out.print("eight hundred ");
	                break;
	            case 9:
	                System.out.print("nine hundred ");
	                break;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Requesting User input
	        System.out.print("Enter a number between 0 and 999: ");
	        int number = input.nextInt();

	        // input validation
	        while (number < 0 || number > 999) {
	            System.out.println("Input Too Large, ");
	            System.out.print("Enter a number between 0 and 999: ");
	            number = input.nextInt();
	        }

	        // Below we start to determine what the input was by
	        // categorising it using boolean

	        // original number (100-999)
	        if (number > 99 && number < 1000) {
	            int h = number / 100;    //find the hundreds only (one, two hundred)
	            hundreds(h);     
	     //print number

	            // first part of number found & printed (hundreds)
	            // remamining 2 digits must be found ie tens & units

	            // test if they are a special number
	            int x = 0;               // initialized variable x for calculations
	            x = number % 100;        // find remainder of hundreds (ie x54)
	            if (x > 10 && x < 20) {  // ie is 54 a special number?
	                special(x);          // print number
	            }
	            // if not special number -> split up into tens & units
	            if (x > 0 && x < 100) {

	                int tens = x / 10;   // finding the tens (forty, fifty)
	                tens(tens);          // print number

	                int units = x % 10;  // finding the units (one, two)
	                units(units);        // print number
	            }
	        }

	        // original number (20-99)
	        if (number > 19 && number < 100) {

	            int t = number / 10;     // finding the tens (forty, fifty)
	            tens(t);                 // print number

	            int u = number % 10;     // finding the units (one, two)
	            units(u);                // print number
	        }

	        // original number (11-19) (Special numbers)
	        if (number > 10 && number < 20) { // (Special numbers)
	            special(number);         // print number
	        }

	        // original number (0-9)
	        if (number < 10) {           // finding the units (one, two)
	            units(number);           // print number
	        }
	    }
	
}
