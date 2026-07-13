package pkg04_string;

import java.util.Scanner;


/**
 * @author SUDHIR
 * * Question: Reverse Each Word of a String (Without StringBuilder & Without Arrays)
 * * Description:
 * This program reverses each word of a sentence using pure character-by-character 
 * traversal. It avoids using StringBuilder, split(), or any character arrays, 
 * making it highly memory-efficient and logic-driven.
 * * Sample Input/Output Example:
 * -------------------------------------------
 * SAMPLE INPUT:
 * Java is fun
 * * SAMPLE OUTPUT:
 * avaJ si nuf
 * -------------------------------------------
 */
public class Q06_ReverseEachWord {
	
	public static String reverseEachWord(String str) {
		String result = "";
		String currentWord = "";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch != ' ') {
				currentWord = ch + currentWord;
			}else {
				result = result + currentWord + " ";
				
				currentWord = "";
			}
		}
		
		result = result + currentWord;
		
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence:");
		String str = sc.nextLine();
		
		System.out.println("\n--- Input sentence is: " + str);
		
		String finalResult = reverseEachWord(str);
		System.out.println("\n--- Result(Reverse each word): " + finalResult);
		
		sc.close();

	}

}
