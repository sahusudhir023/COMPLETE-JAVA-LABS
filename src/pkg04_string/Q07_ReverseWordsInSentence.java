package pkg04_string;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Reverse Words in a Sentence
 * Description: 
 * This program reverses the order of words in a given sentence using String split
 * and backward iteration with StringBuilder for efficiency.
 * 
 * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter a sentence:
 * Java Automation Testing
 * 
 * --- INPUT DATA ---
 * Original Sentence: Java Automation Testing
 * 
 * --- OUTPUT DATA ---
 * Reversed Sentence: Testing Automation Java
 * -------------------------------------------
 */
public class Q07_ReverseWordsInSentence {

	public static String reverseWords(String str) {
		String words[] = str.split("\\s+");
		
		StringBuilder reverseSentence = new StringBuilder();
		
		for(int i = words.length - 1; i >= 0; i--) {
			reverseSentence.append(words[i]);
			
			if(i != 0) {
				reverseSentence.append(" ");
			}
		}
		
		return reverseSentence.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence:");
		String str = sc.nextLine();
		
		System.out.println("\n--- INPUT DATA ---");
		System.out.println("Original Sentence: " + str);
		
		System.out.println("\n--- OUTPUT DATA ---");
		System.out.println("Reversed Sentence: " + reverseWords(str));
		
        sc.close();
	}

}
