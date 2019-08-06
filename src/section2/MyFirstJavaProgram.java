package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot tyrone=new Robot();
  tyrone.sparkle();
   tyrone.setPenColor(100,200,210);
    tyrone.penDown();
     tyrone.setSpeed(100);
	 for(int i=0; i<4; i++) {
	tyrone.move(200);
	  tyrone.turn(90);
	 }
}}
//tyrone is a speedy boi vroom vroom