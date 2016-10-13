/*
 * File: MouseTracker.java
 * --------------------------
 */

import acm.program.*;
import acm.graphics.*;

import java.awt.event.*;

public class MouseTracker extends GraphicsProgram {

	public void init() {
		label = new GLabel("(" + x + ", " + y + ")");
		addMouseListeners();
	}


	public void mouseMoved(MouseEvent e){
		x = e.getX();
		y = e.getY();
		label = new GLabel("(" + x + ", " + y + ")");
		double labelX = x - label.getWidth();
		double labelY = (double) y;
		label.setLocation(labelX, labelY);
		add(label);
		removeAll();
		add(label);
	}

	public void mouseExited(MouseEvent e){
		removeAll();
	}

private GLabel label;
private int x;
private int y;
}
