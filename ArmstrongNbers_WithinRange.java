 // Package declaration
package Date301023;
 // importing scanner class
import java.util.Scanner;

// creating a class to find Armstrong numbers in a given range
public class ArmstrongNbers_WithinRange
{
	// main/entry method
	public static void main(String[] args)
	{
		// creating instance of scanner class
		Scanner sc=new Scanner(System.in);
		// Taking input from the user
		System.out.println("enter starting number");
		int start=sc.nextInt();
		System.out.println("enter ending number");
		int end=sc.nextInt();
		System.out.println("Armstrong Numbers from "+start+ " to "+end+ " are: ");
		// calling method to print Armstrong Numbers
		printArmstrongNumber(start, end);
		// closing scanner object
		sc.close();
	

	}
	 // Method to print Armstrong numbers within a range
	static void printArmstrongNumber( int start, int end)
	{
		int n1, n2;
		// for loop to calculate Armstrong numbers from start to end
		for(int i=start; i<=end; i++)
		{
			n2=n1=i;
			
			 // counting the number of digits
			int count=0;
			while(n1>0)
			{
				n1=n1/10;
				count++;
			}
			
			// finding sum of digits of a number
			int sum=0, rem, pow;
			while(n2>0)
			{
				rem=n2%10;
				pow=1;
				for(int j=1;j<=count;j++)
					pow=pow*rem;
				sum=sum+pow;
				n2=n2/10;
			}
			 // checking the condition if Armstrong or not
			if(sum==i)
			{
				System.out.println(i);
			}
		}

	}

}
