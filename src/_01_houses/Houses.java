package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
	public void run() {
		
		rob.setX(51);
		rob.setY(494);
		rob.penDown();
	int height = 100;
	int length = 50;
	buildHouse();
	}
	static int height = 100;
	static int length = 50;
	public static void buildHouse() {
		rob.setPenColor(Color.BLACK);
		rob.turn(90);
		rob.move(height);
		rob.turn(90);
		rob.move(length);
		rob.turn(90);
		rob.move(height);
		rob.move(90);
		rob.setPenColor(Color.GREEN);
		rob.move(length);
		rob.setPenColor(Color.BLACK);
	}
	
	
	
	
}
