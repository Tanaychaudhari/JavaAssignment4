/* Create an integer array of size n and read the elements from the user 
 * .Add an exception handling block to print the value at nth position of the array
*/
package javaAssignment4;
import java.util.Scanner;
public class nthPositionArray {
	
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the size of the array");
			int size=sc.nextInt();
			
			int arr[]=new int[size];
			System.out.println("Enter the elements of array");
			
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			try {
			System.out.println("Enter the index position from 0 to 4");
			int position=sc.nextInt();
			System.out.println(" value for index " +position + "is : "+arr[position]);
			
			}
			catch(Exception e)
			{
				System.out.println("Invalid position ");
				System.out.println(e.getMessage());
			}
			finally {
				sc.close();
			}
		}

}


