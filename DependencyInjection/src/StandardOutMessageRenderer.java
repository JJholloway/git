
public class StandardOutMessageRenderer {
	
	private HelloWorldMessageProvider messageProvider = null; 
	
	public void setMessageProvider(HelloWorldMessageProvider provider){
		this.messageProvider = provider;
	}

	public void render(){
		
		// the message provider provides the the message for the render to render....
		String message = messageProvider.getMessage();
		System.out.println(message);
		
	}
	
}
