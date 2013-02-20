import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class pr08 
{
	public static void main (String args[]) throws IOException
	{
		Scanner kb = new Scanner (new File("pr08.txt"));
		
		int times = Integer.parseInt(kb.nextLine().trim());
				
		for (int i = 0; i < times; i++)
		{
			int temp = Integer.parseInt(kb.nextLine().trim());
			System.out.print(temp + " ");
			for (int j = 0; j < temp; j++)
			{
				int quo = temp/10;
				int rem = temp%10;
				temp=quo*rem;
				if (temp!=0)
				{
					System.out.print(temp + " ");
				}
				else if (temp == 0 && j == 0)
				{
					System.out.println(temp);
				}
			}
			System.out.println("");
		}
		kb.close();
	}
}
