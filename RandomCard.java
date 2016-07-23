/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.program.*;
import acm.util.*;

public class RandomCard extends ConsoleProgram {
	
	public void run() {
		for(int i = 0; i < 10; i++){
			println("This program displays a randomly chosen card.");
			displayRandomCard();
		}
	}
	
	private void displayRandomCard(){
		int rank = rgen.nextInt(1, 13);
		int suit = rgen.nextInt(1, 4);
		
		switch (rank){
			case 1: print("Ace"); break;
			case 2: print("2"); break;
			case 3: print("3"); break;
			case 4: print("4"); break;
			case 5: print("5"); break;
			case 6: print("6"); break;
			case 7: print("7"); break;
			case 8: print("8"); break;
			case 9: print("9"); break;
			case 10: print("10"); break;
			case 11: print("Jack"); break;
			case 12: print("Queen"); break;
			case 13: print("King"); break;
			default: print("Error"); break;
		}
		
		switch (suit){
			case 1: print(" of Clubs"); println(""); println(""); break; 
			case 2: print(" of Diamonds"); println(""); println("");  break; 
			case 3: print(" of Hearts"); println(""); println("");  break; 
			case 4: print(" of Spades"); println(""); println(""); break; 
			default: print(" Error"); println(""); println(""); break; 
		}
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}

