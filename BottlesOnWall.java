/*
 * File: BottlesOnWall.java
 * ---------------------
 * This program automatically prints out the lyrics to the song 100 bottles of beer on the wall.
 */

import acm.program.*;

public class BottlesOnWall extends ConsoleProgram {
	public void run() {
		for(int i = TOTALBOTTLES; i >= 0; i--){
			if (i > 2){
				println(i + " bottles of beer on the wall.");
				println(i + " bottles of beer.");
				println("You take one down, pass it around.");
				println((i-1) + " bottles of beer on the wall.");
				println(" ");
			} else if (i == 2) {
				println(i + " bottles of beer on the wall.");
				println(i + " bottles of beer.");
				println("You take one down, pass it around.");
				println((i-1) + " bottle of beer on the wall.");
				println(" ");
			} else if (i == 1) {
				println(i + " bottle of beer on the wall.");
				println(i + " bottle of beer.");
				println("You take it down, pass it around.");
				println((i-1) + " bottles of beer on the wall.");
				println("Therefore, the song is over. . . . Are we there yet!?");
			}
		}
	}
	private static final int TOTALBOTTLES = 100;
}
