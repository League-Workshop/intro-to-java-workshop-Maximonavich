package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random r=new Random();
int tyrone = r.nextInt(4);
//3. print out this variable
System.out.println(r);


	// 4. Get the user to enter something that they think is awesome
String name=JOptionPane.showInputDialog("Enter Something you think is awesome");
	// 5. If the random number is 0
if(tyrone==0) {
	// -- tell the user whatever they entered is awesome!
name=JOptionPane.showInputDialog(null, name+"is awesome");
	// 6. If the randoshowMessageDialogm number is 1
if(tyrone==1) {
	// -- tell the user whatever they entered is ok.
name=JOptionPane.showInputDialog(null, name+"is ok");
	// 7. If the random number is 2
if(tyrone==2) {
	// -- tell the user whatever they entered is boring.
name=JOptionPane.showInputDialog(null, name+"is boring");
	// 8. If the random number is 3
if(tyrone==3) {
	// -- write your own answer

name=JOptionPane.showInputDialog(null, name+"is radical! Kachow");
}

}}}}}

