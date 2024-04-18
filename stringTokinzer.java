/*Write a program to split a string containing two words using StringTokenizer 
 * without using hasMoreTokens() method and call nextToken() method three times.
 * Add an exception handling block if necessary.*/

package javaAssignment4;
import java.util.StringTokenizer;
public class stringTokinzer {
	

		public static void main(String[] args) {
		StringTokenizer st= new StringTokenizer("Hello Students  ");
		try {
			String token1=st.nextToken();
			System.out.println(token1);
			String token2=st.nextToken();
			System.out.println(token2);
			String token3=st.nextToken();
			System.out.println(token3);
			
		}catch(Exception e)
		{
			System.out.println("There are no additional tokens to show ...");
		}
		finally {
			//st.close();
		}
		
	}

}


