
public class HelloWorld1 {
	
	public static void main(String [] args){
		
		// If an argument is provided then we will provide it otherwise, display hello world 
		
		for(int i = 0; args.length > i; i++){
			
			System.out.print(args[i] + " ");			
		}if(args.length == 0) {
			System.out.println("Hello World!");
		}
		
	}

}

// With this programme you can change the message without have to recomplie the code 
// so this is one small bit of coupling gone 
//But......
// the rendering is still hard coaded 
// what if we do not want println but maybe strerr or something???

// the code for rendering the message is also responisble for for obtaining a message 
// but what if i want to obtain a message from a webservice???

// so to learn and move forward......
   // The rendering and message provider logic should be logically separate code  so we can change it without changing the rest of the application 

// but a more bais way to put this this -- anything that supplies input or gives output should be seperate code from the rest of the application
// so you can change this without appecting the rest of the application 



