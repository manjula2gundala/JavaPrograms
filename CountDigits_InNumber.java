package Date301023;

import java.util.Scanner;

public class CountDigits_InNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		sc.close();
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("count of digit "+count);
	}

}
