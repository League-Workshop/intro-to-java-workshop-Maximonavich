package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String name=JOptionPane.showInputDialog("How many toes does Ghandi have? (answer with the word)") ;
		// 3.  Use an if statement to check if their answer is correct
		if(name.equalsIgnoreCase("ten")) {
		// 4.  if the user's answer was correct, add one to their score 
		score=score+1;
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		} else {
		score=score+0;
			
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		}
	

// 1.  Create a variable to hold the user's score 
			score=0;
				// 2.  Ask the user a question 
				name=JOptionPane.showInputDialog("How old am I? (answer with the word)") ;
				// 3.  Use an if statement to check if their answer is correct
				if(name.equalsIgnoreCase("thirteen")) {
				// 4.  if the user's answer was correct, add one to their score 
				score=score+2;
				// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
				} else {
				score=score+0;	
				}










// 6.  After all the questions have been asked, print the user's score 

JOptionPane.showMessageDialog(null, score);


}


}
	
