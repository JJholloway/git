package EX1;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

// i am going to create a class that exteneds the Jfram - this means that whenever this class is called it will create a JFrame

public class GUI extends javax.swing.JFrame{
		
	//lets create a new GUI of this class that extents sooooooooo create a JFRAME
	
	
	public GUI(){
		// - put your conponent class here 
		GUIComponents();
	}
	
	// lets keep the rest private so the only public interface of this class is the public GUI
	
	private void GUIComponents(){
		// create the prive variables
		field1 = new javax.swing.JTextField();
		field2 = new javax.swing.JTextField();
		convert = new javax.swing.JButton();
		label1 = new javax.swing.JLabel();
		label2 = new javax.swing.JLabel();
		
		Container container = getContentPane();
		container.setLayout(new GridLayout(3,2));
				
		// make sure that the programme closses
	 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	 setTitle("My programe, bipodie bop");
	
	label1.setText("Please enter you test here");
	label2.setText("The answer is");
	
	// so this is what our button is going to say 
	convert.setText("Convert me baby");
	// no we need to add a action lister to this so it knows when it is pressed
	
    convert.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent evt) {
			onButton.convertAction(evt);		
		}
    });
    
    // lets set the text on te labels 
    
    label1.setText("Please enter you sentence here");
    label2.setText("badda boom .. your answer is..");
    
    // lets put the layout together 
        container.add(label1);
        container.add(label2);
        container.add(field1);
        container.add(field2);
        container.add(convert);


      
	pack();
 	}
	
	public static String getField1(){
		String Q = field1.getText();
		
		return Q;	
	
	}
	
	
	
	
	
	// lets assign some private variables 
	private static javax.swing.JTextField field1;
	private javax.swing.JTextField field2;
	private javax.swing.JButton convert;
	private javax.swing.JLabel label1;
	private javax.swing.JLabel label2;
	
}
	
	