package DesignPatterns;

public class TestCalcChain {

	public static void main(String[] args){
		
		// Here we define all of the object in the chain 
		
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubtractNumbers();
		Chain chainCalc3 = new MultiplyNumbers();
		Chain chainCalc4 = new DivideNumbers();
		
		//Here I tell each object where to forward the data if it cannot process the request 
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		//Define the data in the Numbers Object and send it to the first Object in the chain 
		
		Numbers request = new Numbers(12345,4567,"mult");
		
		chainCalc1.calculate(request);
		
	}
	
}
