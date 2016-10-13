/*
 * File: Fibonacci1.java
 * ---------------------
 * This program prints out the Fibonacci sequence. 
 */

import acm.program.*;

public class Fibonacci1 extends ConsoleProgram {
	public void run() {
		println("This program produces the Fibonnaci Sequence.");
		println("It will display all Fibonnaci numbers, from zero all the way to the index value you indicate.");
		println("");
		int n = readInt("Enter the index value of a Fibonnaci number: ");
		println("");
		if (n == 0){
			print(0);
		} else if (n == 1){
			print(0 + " ");
			print(1 + " ");
		} else {
			int f0 = 0;
			int f1 = 1;
			print(f0 + " ");
			print(f1 + " ");
			for (int i = 1; i < n; i++){
				int nextNumber = f0 + f1;
				print(nextNumber + " ");
				f0 = f1;
				f1 = nextNumber;
			}
		}
	}
}
