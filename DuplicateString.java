/*Write a Java program to remove duplicate characters from a string 
 * using StringBuffer.*/
package javaAssignment4;

public class DuplicateString {
	    public static void main(String[] args) {
	        String inputString = "hello";
	        String result = removeDuplicates(inputString);
	        System.out.println("Original string: " + inputString);
	        System.out.println("String after removing duplicates: " + result);
	    }

	    public static String removeDuplicates(String inputString) {
	        StringBuffer stringBuffer = new StringBuffer();
	        for (int i = 0; i < inputString.length(); i++) {
	            char currentChar = inputString.charAt(i);
	            if (stringBuffer.indexOf(String.valueOf(currentChar)) == -1) {
	                stringBuffer.append(currentChar);
	            }
	        }
	        return stringBuffer.toString();
	    }
	}
