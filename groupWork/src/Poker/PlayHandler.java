package Poker;

//This is the class that will manage the chain.
//It will take in the new request and pass it along the
//chain until there is a class that can manage it

public abstract class PlayHandler {
	
	private PlayHandler handle;
	
	
	// this is where the entry point for the request
	public void processRequest(Request request){
		
		// we want to see if this handler can handle the request
		
		if(this.canHandle(request)){
			
			// if it can then call the handlerequest method
			
			//if (canHandle(request)){
		} else {
			
			// if it cannot handle then pass it to the next handler 
			
			handle.processRequest(request);
			
		}
			
		
		
	}
	
	
	public abstract boolean canHandle(Request request); 
	

    // i don't think that we need the handleRequest below  
	//protected abstract void  handleRequest(Request request);

// below is the method that will chain the the handlers 
// this could be improved 
	
	public void addHandler(PlayHandler handler){
		
		// if there is no more handlers then make this handler the next handler(I can explain that better!!!)
		
		if (handle == null){
			handle = handler;
		}else{
			
			handle.addHandler(handler);
			
		}
		
	}

}
