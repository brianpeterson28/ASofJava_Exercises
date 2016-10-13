/*
 * File: Quadratic.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.program.*;

public class Quadratic extends ConsoleProgram {
	public void run() {
		println("Enter coefficients for the quadratic equation:");
		int a = readInt("a: ");
		int b = readInt("b: ");
		int c = readInt("c: ");
		if (checkIfRealSolutionPossible(a,b,c)){
			println("The first solution is: " + calculatePlusQuadraticSolution(a,b,c));
			println("The second solution is: " + calculateMinusQuadraticSolution(a,b,c));
		} else {
			println("This equation has no real solutions.");
		}

	}
	private double calculatePlusQuadraticSolution (int a, int b, int c) {
		 double plusSolution = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
		 return plusSolution;
	}
	private double calculateMinusQuadraticSolution (int a, int b, int c){
		double minusSolution = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
		return minusSolution;
	}
	private boolean checkIfRealSolutionPossible (int a, int b, int c){
		return (Math.pow(b, 2) - 4*a*c > 0);
	}
}
