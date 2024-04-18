/*Write a Java method to check if an input string is a 
 * palindrome (Use String functions).*/
package javaAssignment4;

public class palindromeChecker {
	
	    public static void main(String[] args) {
	        String inputString = "Nitin";
	        boolean isPalindrome = isPalindrome(inputString);
	        if (isPalindrome) {
	            System.out.println(inputString + " is a palindrome.");
	        } else {
	            System.out.println(inputString + " is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        // Convert the input string to lowercase
	        str = str.toLowerCase();
	        
	        // Remove all non-alphanumeric characters from the string
	        str = str.replaceAll("[^a-z0-9]", "");
	        
	        // Create a reversed version of the string
	        String reversedStr = new StringBuilder(str).reverse().toString();
	        
	        // Check if the original string is equal to its reversed version
	        return str.equals(reversedStr);
	    }
}


