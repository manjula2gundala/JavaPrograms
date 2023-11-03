 // Package declaration
package Date301023;

// Importing scanner class
import java.util.Scanner;

public class Assginment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting number");
		int start=sc.nextInt();
		System.out.println("enter ending number");
		int end=sc.nextInt();
		printArmstrongNumber(start, end);
		sc.close();
	

	}
	         //Method to print Armstrong numbers within a range
	static void printArmstrongNumber( int start, int end)
	{
		int n1, n2;
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
			
			if(sum==i)
			{
				System.out.println(i);
			}
		}
		}

	}
			
//			int num=i;
//			int sum=0;
//			int rem;
//			while(num>0)
//			{
//				rem=num%10;
//				sum+=rem*rem*rem;
//				num=num/10;
//			}
//			if(sum==i)
//			{
//				System.out.println(sum);
//			}
	
