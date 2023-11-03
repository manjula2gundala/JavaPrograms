package Date301023;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int n, n1, count=0, rem, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		n=sc.nextInt();
		sc.close();
		n1=n;
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
		
		System.out.println("Count of digits "+ count);
		
		while (n1>0)
		{
			int power=1;
			rem=n1%10;
			for(int i=1;i<=count;i++)
				power=power*rem;
			
			sum=sum+power;
			n1=n1/10;
		}
		System.out.println("Sum ="+ sum);
	}

}
