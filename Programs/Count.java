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
						System.out.print((Count.factorial(n))/(Count.factorial(r)*Count.factorial(n-r)));
						System.out.println(" This is Combination.");
						break;
					}
				case 'P':
					{
						System.out.print((Count.factorial(n)/Count.factorial(n-r)));
						System.out.println(" This is Permutation.");
						break;
					}
			}
		}
		kb.close();
	}
}
