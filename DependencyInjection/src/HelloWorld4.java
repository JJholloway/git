
public class HelloWorld4 {
	
	public static void main(String[] args){
		
		iMessageRenderer mr = new StanderdOutMessageRenderer1();
		
		iMessageProvider mp = new HelloWorldMessageProvider1();
		
		mr.setMessageProvider(mp);
		
		mr.render();
		
	}

}


// The goods about the hello world 4 collection is that message rendering logic does not get affected by the change in the message provider implementation 
// because it uses the MessageProvider interface as a refernceType 
		// so this means that you can change the message provider e.g maybe to HelloSunshineMorning() but as this implements the iMessageProvider and
		// the renderer uses iMessageProvider interface as reference type 


// the problems 
		// and implementations of renderer and provider are hard coded (we dont like things that we card going to change to be hard coaded!!) in the business logic main example 
		//thus - using a differnet implementation of either means a change to the business logic 
		//

// to FIX this
	// create a factory class.........