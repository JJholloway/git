
public class HelloWorld3 {

	// lets bring together the message prover and render 
	
	public static void main(String [] args){
		
		// as we have decoupled the message render and provider we have to create them 
		
		// creating a renderer 
		StandardOutMessageRenderer mr = new StandardOutMessageRenderer();
		
		// creating a provider 
		HelloWorldMessageProvider mp = new HelloWorldMessageProvider();
		
		// set the message provider to the message render
		
		mr.setMessageProvider(mp);
		
		// then call the message render 
		
		mr.render();
		
	}
}


// the three classes that have just been created have allowed us to create a programme that:
	// change a message provider without affecting the rest of the code

	//change a message renderer without affecting the rest of the application 


// what are the problems with what we have done to create hello world three 

		// well the message is helloWorldProvider is hard coaded 
			// one thing that you want to get rid of with dependency injection is hard coding something that is likely to change in the future 

			//so to take it to the next step we should do the following 

				// Make these compontents outside of the main class inplement an interface 