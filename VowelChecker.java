/*Write a JAVA program to create a method that takes a string as
 *  input and throws an exception if the string does not contain vowels.
 */
package javaAssignment4;


import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        String input = "Hello There!";
        try {
            checkForVowels(input);
            System.out.println("The input string contains vowels.");
        } catch (NoVowelsException e) {
            System.out.println("The input string does not contain any vowels.");
        }
    }

    public static void checkForVowels(String input) throws NoVowelsException {
        if (!containsVowels(input)) {
            throw new NoVowelsException("Input string does not contain any vowels.");
        }
    }

    public static boolean containsVowels(String input) {
        return input.matches(".*[aeiouAEIOU].*");
    }
}

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}
