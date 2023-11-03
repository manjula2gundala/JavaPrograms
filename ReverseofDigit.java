package Date301023;

import java.util.Scanner;

public class ReverseofDigit {

	public static void main(String[] args) {
		int n, sum=0, r, count=0, rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		sc.close();
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			count++;
			rev=(rev*10)+r;	
		}
		System.out.println("Sum of digits: "+sum);
		System.out.println("count of digits: "+count);
		System.out.println("reverse of digits: "+rev);

	}

}
