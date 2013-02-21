package DesignPatterns;

public class AddNumbers implements Chain {
	 
	private Chain nextInChain;

	//Defines the next object to receive the data is this one cant use it
	
	@Override
	public void setNextChain(Chain nextChain) {
	
			this.nextInChain = nextChain;
		
	}

	// this tries to calculate the data or passes it to the object defined in the method setNextChain 
	@Override
	public void calculate(Numbers request) {
		
		if(request.getCalcWanted() == "add"){
			
			System .out.println(request.getNumber1()+ " + " + request.getNumber2()+ 
					" = " + (request.getNumber1()+ request.getNumber2()));
		}else {
			nextInChain.calculate(request);
		}
		
	} 

}
