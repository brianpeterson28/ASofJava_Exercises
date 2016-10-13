/*
 * File: CapitalizeStr.java
 * ---------------------
 * This program formats words by capitalizing 
 * the first letter of each word and lower casing all other letters. 
 */

import acm.program.*;

public class CapitalizeStr extends ConsoleProgram {
	
	public void run() {
		println("Formats words by capitalizing first letter and lowercasing all other letters. It leaves non-letters unchanged.");
		for (int i = 0; i < 3; i++){
			String str = readLine("Please enter a word: "); 
			println(capitalize(str));
		}
	}
	
	private String capitalize (String str){
		int length = str.length();
		String result = "";
		for (int i = 0; i <= length - 1; i++){ //Need the loop to run for length -1; otherwise program breaks and throws an out of bounds exception (because if you use <= it loops one time longer than length of string!!)
			char ch = str.charAt(i);           //Could also fix by using < on test argument rather than <=. A loop with <= 5 actually runs six times. Whereas a loop with < 5 runs five times.  
			if (i == 0 && isLowLtr(ch)){
				result += String.valueOf(ch).toUpperCase();
			} else if (i != 0 && isUprLtr(ch)){
				result += String.valueOf(ch).toLowerCase();
			} else {
				result += String.valueOf(ch);
			}
		}
		return result;
	}
	
	private boolean isLowLtr (char test){
		if (test >= 'a' && test <= 'z'){
			return true;	
		} else {
			return false;
		}	
		
	}

	private boolean isUprLtr (char test){
		if (test >= 'A' && test <= 'Z'){
			return true;	
		} else {
			return false;
		}	
		
	}

}

