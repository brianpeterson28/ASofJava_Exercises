/*
 * File: Fibonacci2.java
 * ---------------------
 */

import acm.program.*;

public class Fibonacci2 extends ConsoleProgram {
	public void run() {
		println("This program produces the Fibonnaci Sequence.");
		println("It will display all Fibonnaci numbers smaller than 10,000");
		println("");
		int f0 = 0;
		int f1 = 1;
		int nextNumber = 0;
		print(0 + "  " + 1 + "  ");
		while (nextNumber < 10000){
			nextNumber = f0 +f1;
			if (nextNumber > 10000) break;
			print(nextNumber + "  ");
			f0 = f1;
			f1 = nextNumber;
		}
	}
}
