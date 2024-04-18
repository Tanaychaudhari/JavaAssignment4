/* Write the Java program that reads an input string and converts it to an integer,
 *  handling the exceptions if the input contains non-digits 
 * or if the input is larger than what an integer can store:*/

package javaAssignment4;

import java.util.Scanner;

	public class StringToIntegerConverter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            System.out.print("Enter a number: ");
	            String input = scanner.nextLine();
	            int number = convertToInteger(input);
	            System.out.println("The integer value is: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Input contains non-digits. Please enter a valid integer.");
	        } catch (IllegalArgumentException e) {
	            System.out.println("Input is too large to be represented as an integer.");
	        } finally {
	            scanner.close();
	        }
	    }

	    public static int convertToInteger(String input) {
	        // Check if input contains non-digits
	        if (!input.matches("\\d+")) {
	            throw new NumberFormatException();
	        }

	        // Convert input to integer
	        long longValue = Long.parseLong(input);

	        // Check if input is within integer range
	        if (longValue < Integer.MIN_VALUE || longValue > Integer.MAX_VALUE) {
	            throw new IllegalArgumentException();
	        }

	        return (int) longValue;
	    }
}


