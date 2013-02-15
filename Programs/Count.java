import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Count 
{	
	public static long factorial(long n)
	{
		if (n == 1)
		{
			return 1;
		}
		return n*factorial(n-1);
	}
	
	public static long permutation(long n, long nr)
	{
		return n / (nr); 
	}
	
	public static long combination(long n, long r, long nr)
	{
		return n / (r*(nr));
	}
	
	public static void main(String args[]) throws IOException
	{
		Scanner kb = new Scanner (new File("count.dat"));

		int times = Integer.parseInt(kb.nextLine().trim());

		for (int i = 0; i < times; i++)
		{
			String temp = kb.nextLine().trim();

			long n = Long.parseLong(temp.substring(0,2));
			long r = Long.parseLong(temp.substring(3));
			
			char methd = temp.charAt(2);

			switch (methd)
			{
				case 'C':
					{
						System.out.print("This is Combination: ");
						System.out.println(Count.combination(Count.factorial(n), Count.factorial(r), Count.factorial(n-r)));
						break;
					}
				case 'P':
					{
						System.out.print("This is Permutation: ");
						System.out.println(Count.permutation(Count.factorial(n), Count.factorial(n-r)));
						break;
					}
			}
		}
		kb.close();
	}
}
