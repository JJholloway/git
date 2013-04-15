
public class StanderdOutMessageRenderer1 implements iMessageRenderer{

	
	//message provider is a Java interface 
	
	private iMessageProvider messageProvider = null;
	
	
	@Override
	public void render() {
		if (messageProvider == null)
				throw new RuntimeException(
						"You must set property messageProver of class:" + StandardOutMessageRenderer.class.getName()
						); 
					System.out.println(messageProvider.getMessage())
						;
						}
	
	// MessageProvider is Java Interface 

	@Override
	public void setMessageProvider(iMessageProvider provider) {
		this.messageProvider = provider;
		
	}

	@Override
	public iMessageProvider getMessageProvider() {
		return this.messageProvider;
	}

}
