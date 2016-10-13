/*
 * File: AddOddInt.java
 * ---------------------
 * This program sums the odd numbers in number line. 
 */

import acm.program.*;

public class AddOddInt extends ConsoleProgram {
	
	public void run() {
		
		//Prints instructions for AddOddInt program. 
		println("This is the Add Odd Integers program.");
		println("It adds the number of odd integers on the number line based on input from you.");
		println("For example, if you want to know the sum of the first two odd integers on the numberline (i.e. 1 and 3) then enter 2.");
		println("To terminate the program, enter 0.");
		
		//Initialize variable that will control loop. 
		int tl = 1;
		
		//While loop that controls how long program will run. Program will run until the user enters 0. 
		while (tl != 0){
			
			//Ask user for input. 
			println("");
			int n = readInt ("Enter a positive integer that is greater than zero: ");
			tl = n;
			
			//If value entered is 0. Exit loop and terminate program. 
			if (n == 0){
				println("");
				println("Add Odd Integers program terminated.");
			}
			
			//If value entered is 1 then print answer is 1.   
			else if (n == 1){
				println("The total is 1.");
			
			//Output for entries other than 0 or 1. 
			//Core Program Logic: First, add 2 to oddValues (n - 1) times. Second, add 1 oddValues to makeup for the corner case of n = 1 (This is done in print statement below).   
			} else {
				int oddValues = 1;
				int total = 0;
				for(int i = 1; i < n; i++){
					oddValues += 2;
					total += oddValues;
				}
				
			//Prints value created by Core Program Logic. (Adds one to makeup for the corner case of n = 1).  	
			println("The total is " + (total + 1));
			
			}
		}
	}
}

