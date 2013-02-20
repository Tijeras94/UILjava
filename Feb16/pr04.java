import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class pr04 
{
	public static void main (String args[]) throws IOException
	{
		Scanner kb = new Scanner (new File ("pr04.txt"));
		int times = Integer.parseInt(kb.nextLine().trim());
		for (int i = 0; i < times; i++)
		{
			String[] temp = kb.nextLine().split(" ");
			for (int j = 0; j < temp.length; j++)
			{
				if (temp[j].length() > 2)
				{
					System.out.print(temp[j].charAt(0));
				}
			}
			System.out.println("");
		}
		kb.close();
	}
}
