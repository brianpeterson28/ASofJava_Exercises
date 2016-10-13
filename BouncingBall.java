/*
 * File: BouncingBall.java
 * --------------------------
 * This program creates a window containing a bouncing ball with a background image. 
 */

import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class BouncingBall extends GraphicsProgram {
	//private static final int N_STEPS = 1000;
	private static final int PAUSE_TIME = 2;
	private static final double BALL_SIZE = 100;
	//private static final String MESSAGE = "CORNELL UNIVERSITY";

	public void run() {
		
		GImage logo = new GImage("cornelllogo.png");
		logo.setSize(getWidth(), getHeight());
		add(logo);
		
		double startX = (getWidth()-BALL_SIZE) /2;
		double startY = (getHeight()-BALL_SIZE)/2;		
		GOval ball = new GOval(startX,startY,BALL_SIZE,BALL_SIZE);
		ball.setFilled(true);
		ball.setFillColor(Color.RED);
		add(ball);
		double dx = 1;
		double dy = 1;
		
				
		while (true){
			ball.move(dx,dy);
			pause(PAUSE_TIME);
			double x = ball.getX();
			double y = ball.getY();
			
			if (x >=getWidth()-BALL_SIZE){
				dx=-dx;
			}
			if (y>= getHeight()-BALL_SIZE){
				dy=-dy;
			}
			if (x==0){
				dx=-dx;
			}
			if (y==0){
				dy=-dy;
			}

		}
	
	}

}
