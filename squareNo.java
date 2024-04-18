/*Write a program to calculate the square value of any number given by the user 
 * .Add an exception handling block to check whether the user enter letters 
 * instead of numbers
 */
package javaAssignment4;
import java.util.Scanner;
public class squareNo {
	
		public static void main(String[] args) {
			System.out.println("Enter the No");
			Scanner sc = new Scanner(System.in);
			try {
			String num=sc.next();
			int num1=Integer.parseInt(num);
			
			int square=num1*num1;
			System.out.println("Square of the No = "+square);
			}catch(Exception e)
			{
				System.out.println("Enter valid Input");
				System.out.println(e.getMessage());
				
				
			}finally {
				sc.close();
			}

		}

	}


