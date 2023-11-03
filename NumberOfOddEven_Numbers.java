// package declaration
package Date301023;
// importing scanner class 
import java.util.Scanner;
// class to find number of even and odd numbers
public class NumberOfOddEven_Numbers
{
	// main method
	public static void main(String[] args)
	{
		// scanner object
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to count even and odd numbers in it");
		int number=sc.nextInt();
		// closing object of scanner
		sc.close();
		// data members
		int even_count=0, odd_count=0;
		
		while(number>0)
		{
			// extracting last digit from the given number
			int last_digit=number%10;
			// checking the condition whether even or odd
			if(last_digit%2==0)
			{
				// incrementing even count value
				even_count++;
			}
			else
			{
				// incrementing even count value
				odd_count++;
			}
			//  cut the last digit 
			number=number/10;   		
		}
		System.out.println("count of even numbers: "+even_count);
		System.out.println("count of odd numbers: "+odd_count);
	}

}
