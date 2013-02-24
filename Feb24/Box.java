import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Box
{
	public static void SeveralBoxes() throws IOException
	{
		Scanner kb = new Scanner (new File("box.dat"));
		int times = kb.nextInt();
		for (int i = 1; i <= times; i++)
		{
			int side = kb.nextInt();
			ConstructBox(side);
		}
		kb.close();
	}
	public static void ConstructBox(int side)
	{
		for (int i = 1; i <= side; i++)
		{
			if (i == 1 || i == side)
			{
				for (int j = 1; j <= side; j++)
				{
					System.out.print("$ ");
				}
			}
			else if (i != 1 || i != side)
			{
				for (int k = 1; k <= side; k++)
				{
					if (k == 1 || k == side)
					{
						System.out.print("$ ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			System.out.println("");
		}
		System.out.println("");
	}
	public static void main(String args[]) throws IOException
	{
		SeveralBoxes();
	}
}
