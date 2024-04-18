/*Write a Java program to concatenate all elements of a string array 
 * efficiently using StringBuilder.*/
package javaAssignment4;

public class ConcatenateArrayElements {
	
	    public static void main(String[] args) {
	        String[] stringArray = {"This", "is", "a", "sample", "array"};
	        String concatenatedString = concatenateArrayElements(stringArray);
	        System.out.println("Concatenated string: " + concatenatedString);
	    }

	    public static String concatenateArrayElements(String[] stringArray) {
	        StringBuilder stringBuilder = new StringBuilder();
	        for (String str : stringArray) {
	            stringBuilder.append(str);
	        }
	        return stringBuilder.toString();
	    }
}


