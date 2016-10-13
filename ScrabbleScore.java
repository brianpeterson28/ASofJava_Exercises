/*
 * File: ScrabbleScore.java
 * ---------------------
 * This program calculates a word's Scrabble score. 
 */

import acm.program.*;

public class ScrabbleScore extends ConsoleProgram {
	public void run() {
		println("This program calculates a word's Scrabble Score.");
		while (true){
			String word = readLine("Enter a word using all capital letters: ");
			println("The word " + word + " is worth " + calcScore(word) + " points");
			println("");
		}
	}
	
	private int calcScore (String word){
		int score = 0;
		int length = word.length();
		for (int i = 0; i < length; i++){
			char ch = word.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'L' || ch == 'N' || ch == 'O' || ch == 'R' || ch == 'S' || ch == 'T' || ch == 'U'){
				score += 1;
			} else if (ch == 'D' || ch == 'G'){
				score += 2;
			} else if (ch == 'B' || ch == 'C' || ch == 'M' || ch == 'P'){
				score += 3;
			} else if (ch == 'F' || ch == 'H' || ch == 'V' || ch == 'W' || ch == 'Y'){
				score += 4;
			} else if (ch == 'K'){
				score += 5;
			} else if (ch == 'J' || ch == 'X'){
				score += 8;
			} else if (ch == 'Q' || ch == 'Z'){
				score += 10;
			}
		}
		return score;	
	}
}

