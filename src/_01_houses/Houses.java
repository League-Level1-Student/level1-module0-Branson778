package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
	static int height = 100;
	static int length = 50;
	static int small = 60;
	static int medium = 120;
	static int large = 250;
 static Random ran = new Random();
	public void run() {
		
		rob.setX(51);
		rob.setY(494);
		rob.penDown();
		rob.setSpeed(100);
		int sml = ran.nextInt(3);
		for (int i = 0; i < 8; i++) {
			if(sml==0) {
				buildPeakedHouse("Small", Color.BLACK);
			}
			else if(sml==1) {
				buildPeakedHouse("Medium", Color.BLUE);
			}
			else if(sml==2) {
				buildHouse("Large", Color.RED);
			}
		sml = ran.nextInt(3);
		}
	}
	public static void buildHouse(String height1, Color color) {
		if (height1.equalsIgnoreCase("Small")) {
			height = 60;
		}
		else if(height1.equalsIgnoreCase("Medium")) {
			height=120;
		}
		else if(height1.equalsIgnoreCase("Large")) {
			height=250;
		}
		rob.setPenColor(color);
		rob.move(height);
		rob.turn(90);
		rob.move(length);
		rob.turn(90);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(Color.green);
		rob.move(length);
		rob.setPenColor(color);
		rob.turn(-90);
	}
	public static void buildPeakedHouse(String height2, Color color){
	if(height2.equalsIgnoreCase("Small")) {
		height = 60;
	}
	if(height2.equalsIgnoreCase("Medium")) {
		height = 120;
	}
		rob.setPenColor(color);
		rob.move(height);
		rob.turn(45);
		rob.move(25);
		rob.turn(90);
		rob.move(25);
		rob.turn(45);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(Color.green);
		rob.move(length);
		rob.setPenColor(color);
		rob.turn(-90);
	}
	
	
	
}
