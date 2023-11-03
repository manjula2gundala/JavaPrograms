 // package declaration
package Date301023;
// importing scanner class
import java.util.Scanner;
// creating a class called employee gross salary
public class Employee_GrossSalary
{
	// main method- execution starts here
	public static void main(String[] args) 
	{
		// Creating instance of scanner class
		Scanner sc = new Scanner(System.in);
		// data members
		float basic_salary, hra, da;
		int choice;

		// do-while loop- to run the program atleast once
		do
		{
			System.out.println("Enter basic salary of employee ");
			basic_salary =sc.nextFloat();
			// checking the conditions
			if(basic_salary>15000)
			{
				hra=basic_salary*20/100;
				da= basic_salary*60/100;
				
			}
			else
			{
				hra=3000;
				da=basic_salary*70/100;
			}
			
			System.out.println("HRA: "+ hra);
			System.out.println("DA: "+ da);
			
			// taking input from the user whether to continue or not
			System.out.println("Do you want to continue for another Employee if yes input -1");
			choice=sc.nextInt();
			
			// if input is other than -1 come out of the loop
			if(choice!= -1)
				break;
			
		}
		// if input is -1 ask for other employee salary details
		while(choice== -1);
		System.out.println("End of execution...");
	}
}
