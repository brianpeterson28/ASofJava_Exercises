/*
 * File: Fibonacci3.java
 * ---------------------
 */

import acm.program.*;

public class Fibonacci3 extends ConsoleProgram {
	public void run() {
		println("This program calculates the nth number in the Fibonnaci Sequence.");
		println("Enter an index value and it will display the corresponding number from the sequence.");
		println("");
		int n = 0;
		while (n >= 0){
			println("");
			n = readInt("Enter index value n: ");
			println("The " + n + "th fibonacci number is " + fibonacci(n));
		}
	}
	private int fibonacci(int n){
		if (n == 0){
			return 0;
		} else if (n == 1){
			return 1;
		} else {
			int f0 = 0;
			int f1 = 1;
			int nextNumber = 0;
			for (int i = 1; i < n; i++){
				nextNumber = f0 + f1;
				f0 = f1;
				f1 = nextNumber;
			}
			return nextNumber;
		}
	}
}
