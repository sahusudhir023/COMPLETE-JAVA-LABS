package pkg04_string;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Check if a String is Palindrome
 * * Description:
 * This program checks if a string reads the same backwards as forwards.
 * It reverses the input string using StringBuilder and compares the two 
 * strings using equalsIgnoreCase() to handle case-insensitivity.
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter the words:
 * Radar
 * * --- Input words are: Radar
 * This word is Palindrome.
 * -------------------------------------------
 */
public class Q04_A_Palindrome_Basic {

	public static String reverseString(String str) {
		StringBuilder reversed = new StringBuilder();
		
		for(int i=str.length()-1; i>=0; i--) {
			reversed.append(str.charAt(i));
		}
		
		return reversed.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the words:");
		String str = sc.nextLine();
		
	    System.out.println("\n--- Input words are: "+str);
		
		String reversedString = reverseString(str);
		
		if(str.equalsIgnoreCase(reversedString)) {
			System.out.println("This word is Palindrome.");
		}else {
			System.out.println("This word is not Palindrome.");
		}
		
		sc.close();
	}

}
