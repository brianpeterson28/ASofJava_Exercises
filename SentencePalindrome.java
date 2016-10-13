/*
 * File: SentencePalindrome.java
 * ---------------------
 */

import acm.program.*;

public class SentencePalindrome extends ConsoleProgram {
	public void run() {
		println("This program checks for sentence palindromes.");
		while (true){
			String str = readLine("Enter a sentence: ");
			if (isSentencePalindrome(str)){
				println("That sentence is a palindrome.");
			} else {
				println("That sentence is not a palindrome.");
			}
		}
	}

	private boolean isSentencePalindrome(String str){
		String forwardStr = removePunc(str);
		String backwardStr = reverseString(str);
		if (forwardStr.equalsIgnoreCase(backwardStr)){
			return true;
		} else {
			return false;
		}
	}

	private String reverseString(String str){
		int length = (str.length()) - 1;
		String result = "";
		char ch = 0;
		for (int i = length; i >= 0; i--){
			ch = str.charAt(i);
			if (isLowLtr(ch) || isUprLtr(ch)){
				result += String.valueOf(ch);
			}
		}
		return result;
	}

	private String removePunc(String str){
		int length = str.length();
		String result = "";
		char ch = 0;
		for (int i = 0; i < length; i++){
			ch = str.charAt(i);
			if (isLowLtr(ch) || isUprLtr(ch)){
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
