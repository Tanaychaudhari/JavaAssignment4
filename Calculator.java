/* Write a program that creates a Calculator class.
*/

package javaAssignment4;
import java.util.*;

	public class Calculator {
		int num1;
		int num2;
		

		public Calculator(int num1, int num2) {
			super();
			this.num1 = num1;
			this.num2 = num2;
		}
		public int addition() {
			if(num1<0 || num2<0)
			{
				throw new ArithmeticException("Both nos cannot be -ve");
			}
			return num1+num2;
		}
		public int subtract() {
			if(num1<0 ||num2<0)
			{
				throw new ArithmeticException("Both nos should not be negative");
			}
			
			return num1-num2;
		}
		public int multi() {
			if(num1==0 || num2==0) {
				throw new ArithmeticException("Both nos should not be Zero");
			}
			return num1*num2;
		}

		public double division() {
			
			if(num2==0) {
				throw new ArithmeticException("Denominator should not be Zero");
			}
			return(double) num1 / num2;
		}
		public static void main(String[] args) {
			System.out.println("Enter Two Numbers: ");
			Scanner sc = new Scanner(System.in);
			try {
				String num1=sc.next();
				String num2=sc.next();
				Calculator obj=new Calculator(Integer.parseInt(num1),Integer.parseInt(num2));
				System.out.println("Addition ="+obj.addition());
				System.out.println("Subtraction = "+obj.subtract());
				System.out.println("Multiplication = "+obj.multi());
				System.out.println("Divison ="+obj.division());
			}
			catch(NumberFormatException e) {
				System.out.println("Please enter Valid input ");
				System.out.println(e.getMessage());
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}

}

