import java.io.IOException;
import java.util.Scanner;


public class pr01 
{
	public static void main (String args[]) throws IOException
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter input data: ");
		int n = Integer.parseInt(kb.nextLine().trim());
		
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (i == 0 || i == n-1)
				{
					System.out.print("* ");
					if (j == n-1)
					{
						System.out.println("");
					}
				}
				else if (i != 0 || i != n-1)
				{
					if (j == 0 || j == n-1)
					{
						System.out.print("* ");
						if (j == n-1)
						{
							System.out.println("");
						}
					}
					else if (j != 0 || j != n-1)
					{
						System.out.print("  ");
					}
				}
			}
		}
		kb.close();
	}
}
