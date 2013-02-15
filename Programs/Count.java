import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Count 
{
	public int x;
	
	public static long factorial(long n)
	{
		if (n == 0)
		{
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main(String args[]) throws IOException
	{
		Scanner kb = new Scanner (new File("count.dat"));

		int times = Integer.parseInt(kb.nextLine().trim());

		for (int i = 0; i < times; i++)
		{
			String temp = kb.nextLine().trim();

			long y = Long.parseLong(temp.substring(0,2));
			long z = Long.parseLong(temp.substring(3));
			
			char methd = temp.charAt(2);

			switch (methd)
			{
				case 'C':
					{
						long n = Count.factorial(y);
						long r = Count.factorial(z);
						long nr = Count.factorial(n-r);
						System.out.print(n/(r*(nr)));
						System.out.println(" This is Combination.");
					}
				case 'P':
					{
						long n = Count.factorial(y);
						long r = Count.factorial(z);
						long nr = Count.factorial(n-r);
						System.out.print(n/(nr));
						System.out.println(" This is Permutation.");
					}
			}
		}
		kb.close();
	}
}
