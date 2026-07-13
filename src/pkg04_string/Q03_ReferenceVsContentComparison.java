package pkg04_string;


/**
 * @author SUDHIR
 * Question: Reference vs Content Comparison (Arrays and Strings)
 * * Description:
 * This program demonstrates how the '==' operator and '.equals()' method work 
 * in Java. It compares memory references for arrays and shows the difference 
 * between String Constant Pool (SCP) literals and Heap memory objects.
 * * Sample Output Example:
 * -------------------------------------------
 * --- ARRAY DATA ---
 * Both are not equal.
 * arr1 Address is: [I@hashcode,  arr2 Address is: [I@hashcode
 * * --- STRING DATA ---
 * * -- Comparison: str1 == str2 (Literals) --
 * Both are equal.
 * * -- Comparison: str1 == str3 (Literal vs New Object) --
 * Both are not equal.
 * * -- Comparison: str1.equals(str3) (Content Check) --
 * Both are equal.
 * -------------------------------------------
 */
public class Q03_ReferenceVsContentComparison {

	public static void main(String[] args) {
		
		System.out.println("\n--- ARRAY DATA ---");
		
		int arr1[] = {1,2};
		int arr2[] = {1,2};
		
		// '==' checks memory addresses for arrays
		if(arr1 == arr2) {
			System.out.println("Both are equal.");
		}else {
			System.out.println("Both are not equal.");
			System.out.println("arr1 Address are: " + arr1 + ",  arr2 Address are: " + arr2);
		}
		
		
		
		System.out.println("\n--- STRING DATA ---");
		String str1 = "abcd";
		String str2 = "abcd";
		
		// Checks SCP references (Both point to same "abcd" in pool)
		System.out.println("\n-- Comparison: str1 == str2 (Literals) --");
		if(str1 == str2) {
			System.out.println("Both are equal.");
		}else {
			System.out.println("Both are not equal.");
		}
		
		
		String str3 = new String("abcd");
		
		// Checks Heap vs SCP references (Addresses are different)
		System.out.println("\n-- Comparison: str1 == str3 (Literal vs New Object) --");
		if(str1 == str3 ) {
			System.out.println("Both are equal.");
		}else {
			System.out.println("Both are not equal.");
		}
		
		// Checks actual text content inside objects
		System.out.println("\n-- Comparison: str1.equals(str3) (Content Check) --");
		if(str1.equals(str3)) {
			System.out.println("Both are equal.");
		}else {
			System.out.println("Both are not equal.");
		}

	}

}
