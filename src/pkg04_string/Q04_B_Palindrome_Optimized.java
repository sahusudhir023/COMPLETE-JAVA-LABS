package pkg04_string;

import java.util.Scanner;


/**
 * @author SUDHIR
 * Question: Optimized Palindrome Check (Two-Pointer Approach)
 * * Description:
 * This program checks if a string is a palindrome without reversing it.
 * It uses a symmetric comparison approach, running the loop only up to n/2 
 * and comparing characters from both ends (i and j), making it memory efficient.
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Enter the words:
 * RaDar
 * * --- Input words are: RaDar
 * This word is Palindrome.
 * -------------------------------------------
 */
public class Q04_B_Palindrome_Optimized {

	public static void checkPalindrome(String str) {
		int length = str.length();
		
		for(int i=0; i<length/2; i++) {
			int j = length - 1 - i;
			
			if(str.charAt(i) != str.charAt(j)) {
				System.out.println("This word is not Palindrome.");
				return;
			}
		}
		System.out.println("This word is Palindrome.");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the words:");
		String str = sc.nextLine();
		
		System.out.println("\n--- Input word are: " + str);
		
		String strCase = str.toLowerCase(); 
		checkPalindrome(strCase);
		
		sc.close();
	}

}
