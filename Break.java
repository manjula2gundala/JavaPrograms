package Date301023;

public class Break {

	public static void main(String[] args) {
		for(int i=1; i<=30; i++)
		{
			if(i%5==0)
				continue;
			else
				System.out.print(i+" ");
		}

		
		for(int j=1; j<=30; j++)
		{
			if(j==20)
				break;
			else
				System.out.print(j+" ");
		}

	}

}
