
public interface iMessageRenderer {
	
	public void render();
	
	// the getters and setters
	public void setMessageProvider(iMessageProvider provider);
	
	public iMessageProvider getMessageProvider();

}
