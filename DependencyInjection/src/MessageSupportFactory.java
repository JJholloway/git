
import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {
	
	// this is the factory that will read in the class names from the properties file 
	
	// why do we do this??
	private static MessageSupportFactory instance = null; 
	private Properties props = null; 
	private iMessageProvider provider = null;
	private iMessageRenderer renderer = null; 
	
	
	private MessageSupportFactory() {
		
		props = new Properties();
		try{
			props.load(new FileInputStream("helloworld.properties"));
			
			// Get the name of the implementation classes 
			String rendererClass = props.getProperty("renderer");
			String providerClass = props.getProperty("provider");
			
			// Create object instances of MessRenderer and MessageProvider 
			
			// i dont actually understand what this code means!?!!?!?!?
			renderer = (iMessageRenderer) Class.forName(rendererClass).newInstance();
			provider = (iMessageProvider) Class.forName(providerClass).newInstance();
			
				
		}catch (Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	// create a new message support factory
	static {
		instance = new MessageSupportFactory();
	}

// create a new factory for that instance 
	public static MessageSupportFactory getIntance(){
		return instance;
	}
	
	public iMessageRenderer getMessageRenderer(){
		return renderer;
		}
	
	public iMessageProvider getMessageProvider(){
		return provider;
	}

}
