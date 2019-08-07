package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String name=JOptionPane.showInputDialog("Enter an adjective");
		// Get the user to enter a type of liquid
		String poop=JOptionPane.showInputDialog("Enter the name of a liquid");
		// Get the user to enter a body part
		String yeet=JOptionPane.showInputDialog("Enter the name of a body part");
		// Get the user to enter a verb
		String ahh=JOptionPane.showInputDialog("Enter a verb");
		// Get the user to enter a place
	String	skiddadle=JOptionPane.showInputDialog("Enter the name of a place");
		// Fit the user's words into this sentence, and save it in a String:
		
	
	JOptionPane.showMessageDialog(null,"Piranhas are more "+name+
			"during the day, so cross the river at night.\n Piranhas are attracted to fresh "+poop+
			" and will most likely take a bite out of your "+ yeet+
			" if you "+ ahh+ 
			" \n Whatever you do, if you have an open wound, try to find another way to get back to the "+ skiddadle+
			". Good luck!");
	
	
			// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

