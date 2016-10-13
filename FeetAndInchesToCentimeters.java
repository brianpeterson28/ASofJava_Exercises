/*
 * File: FeetAndInchesToCentimeters.java
 * ---------------------
 * This class takes distances that have been measured in feet and inches and converts them to centimeters. 
 */

import acm.program.*;

public class FeetAndInchesToCentimeters extends ConsoleProgram {
	public void run() {
		println ("This program converts feet and inches into centimeters.");
		int feet = readInt ("Enter number of feet: ");
		int inches = readInt ("Enter number of inches: ");
		double fcm = feet * CM_PER_FOOT; 
		double icm = inches * CM_PER_INCH; 
		println (feet + "ft " + inches + "in" + " = " + (fcm + icm) + "cm");
		
	}
	private static final double CM_PER_FOOT = 30.48;
	private static final double CM_PER_INCH = 2.54;
}

