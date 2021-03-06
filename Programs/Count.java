import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Count 
{
	public static long permutation, combination;
	
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
		permutation = n / (nr);
		return permutation; 
	}
	
	public static long combination(long n, long r, long nr)
	{
		combination = n / (r*(nr));
		return combination;
	}
	
	public static void main(String args[]) throws IOException
	{
		Scanner kb = new Scanner (new File("count.dat"));

		int times = Integer.parseInt(kb.nextLine().trim());

		for (int i = 0; i < times; i++)
		{
			String temp = kb.nextLine().trim();
			
			char methd = temp.charAt(2);
			
			switch (methd)
			{
				case 'C':
					{
						String [] c = temp.split("C");
						
						long n = Long.parseLong(c[0]);
						long r = Long.parseLong(c[1]);
						
						System.out.println(c[0]);
						System.out.println(c[1]);
						
						System.out.print("This is Combination: ");
						System.out.println(Count.combination(Count.factorial(n), Count.factorial(r), Count.factorial(n-r)));
						break;
					}
				case 'P':
					{
						String [] p = temp.split("P");
						
						long n = Long.parseLong(p[0]);
						long r = Long.parseLong(p[1]);
						
						System.out.println(p[0]);
						System.out.println(p[1]);
						
						System.out.print("This is Permutation: ");
						System.out.println(Count.permutation(Count.factorial(n), Count.factorial(n-r)));
						break;
					}
			}
		}
		kb.close();
	}
}
