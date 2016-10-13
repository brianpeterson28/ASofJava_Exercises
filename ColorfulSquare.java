/*
 * File: ColorfulSquare.java
 * --------------------------
 * Opens a window with a centered square that randomly changes colors. 
 */

import java.awt.Color;

import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;

public class ColorfulSquare extends GraphicsProgram {

	public void run() {
		GRect square = new GRect(sideLength, sideLength);
		double x = (getWidth() - square.getWidth()) / 2;
		double y = (getHeight() - square.getHeight()) / 2;
		square.setFilled(true);
		
		while(true){
			square.setColor(colorOfObj());
			add(square, x, y);
			pause(PAUSE_TIME);
		}
	}
	
	private Color colorOfObj(){
		int r = rgen.nextInt(0, 255);
		int g = rgen.nextInt(0, 255);
		int b = rgen.nextInt(0, 255);
		Color color = new Color(r,g,b);
		return color;
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final double sideLength = 100.0;
	private static final double PAUSE_TIME = 500;

}
