/*
 * File: RandomWords.java
 * ---------------------
 */

import acm.program.*;
import acm.util.RandomGenerator;

public class RandomWords extends ConsoleProgram {

	public void run() {

		println("This program generates " + NUMBER_OF_WORDS + " random \"words\" that are between " + MIN_LETTERS + " and " + MAX_LETTERS + " letters in length.");
		println("The length of each word is randomly selected and the letters within each word are randomly selected.");
		println("");

		for(int i = 0; i <= NUMBER_OF_WORDS; i++){
			printRandomWord();
		}

	}

	private void printRandomWord(){
		int wordLength = rgen.nextInt(MIN_LETTERS, MAX_LETTERS);

		for(int i = 0; i <= wordLength; i++){
			char randomLetter = (char) rgen.nextInt('a', 'z');
			print(randomLetter);
		}
		println("");
	}

	private static final int MIN_LETTERS = 3;
	private static final int MAX_LETTERS = 10;
	private static final int NUMBER_OF_WORDS = 50;
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
