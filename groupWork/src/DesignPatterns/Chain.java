package DesignPatterns;

//The Chain of responsibility pattern has a group of object that are expected to 
//solve a problem between them. 
// if the first object cannot solve it then it passes it to the next object in the chain

public interface Chain {

	// This defines the next object to receive the data if this object can't process it 
	public void setNextChain(Chain nextChain);
	
	
	// This either solves the problem or passes the data to the next Object in the chain 
	public void calculate(Numbers request);
	
	
}
