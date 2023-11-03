package Date301023;

public class NonPrimeNbers {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++)          // i=1   i=2
		{
			int count=0;
			for(int j=1; j<=i; j++)  // j=1   j=1, 2
			{   
				if(i%j==0)   // 1=1  1!=2, 2=2
				{
					count++;      // count=1   count=2
				}
			}
			if(count==2)       // count=1 (skip i=1)
			{
				continue;
			}
			System.out.print(i+" "); // 1 
		}

	}

}
