/*
 * File: AverageList.java
 * ---------------------
 * This program calculates the average of a list of numbers. 
 */

import acm.program.*;

public class AverageList extends ConsoleProgram {
	public void run() {
		println("This program averages test scores.");
		println("Enter test scores, one per line");
		println("Enter " + SENTINEL + "to signal the end of the list and display the average.");
		println("");
		float sumOfTestScores = 0; //initialize variable to store total of all scores
		float numberOfTestScores = 0; // initialize variable to store total number of loops, will be used as denominator to calculate average
		while (true){ //creates infinite loop, but this is ok because we have sentinel in place and disclosed it to user
			int testScore = readInt("Enter test score: ");
			if(testScore == SENTINEL) break; //will break loop to prevent program from infinitely looping
			sumOfTestScores += testScore; //will keep adding test scores into variable until while loop terminated by sentinel 
			numberOfTestScores += 1; //will increase by one with each loop
		}
		println("The average test score is " + (sumOfTestScores/numberOfTestScores) + ".");
	}
	private static final int SENTINEL = -1;
}

