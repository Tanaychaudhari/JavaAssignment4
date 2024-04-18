/* Write a Java program that compares two wrapper objects for equality and demonstrates 
 * when to use equals() instead of == (try with Integer or Float classes)*/

package javaAssignment4;

public class wrapperComparison {

	public static void main(String[] args) {
        // Comparing two Integer objects
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);
        
        // Using == to compare Integer objects
        System.out.println("Using == to compare Integer objects:");
        System.out.println(num1 == num2); // Prints false because == compares object references
        
        // Using equals() to compare Integer objects
        System.out.println("Using equals() to compare Integer objects:");
        System.out.println(num1.equals(num2)); // Prints true because equals() compares object values
        
        // Comparing two Float objects
        Float f1 = new Float(5.5);
        Float f2 = new Float(5.5);
        
        // Using == to compare Float objects
        System.out.println("Using == to compare Float objects:");
        System.out.println(f1 == f2); // Prints false because == compares object references
        
        // Using equals() to compare Float objects
        System.out.println("Using equals() to compare Float objects:");
        System.out.println(f1.equals(f2)); // Prints true because equals() compares object values
    }
}
